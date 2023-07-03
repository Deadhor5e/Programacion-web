package com.banco.bancobackend.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bancobackend.model.Cliente;
import com.banco.bancobackend.model.Transferencia;
import com.banco.bancobackend.repository.TransferenciaRepository;

@Service
public class TransferenciaService {

	@Autowired
	TransferenciaRepository transferenciaRepository;

	@Autowired
	ClienteService clienteService;

	// Obtener todos las transferencias
	public ArrayList<Transferencia> leerTransferencias() {
		return (ArrayList<Transferencia>) this.transferenciaRepository.findAll();
	}

	// Leer transferencia
	public Optional<Transferencia> leerTransferenciaPorId(Integer id) {
		return this.transferenciaRepository.findById(id);
	}

	// Guardar (crear o actualizar) una transferencia y lo devuelve con ID
	public Transferencia guardarTransferencia(Transferencia transferencia) {

		this.transferenciaRepository.save(transferencia);

		Double importe = transferencia.getImporte();

		Cliente ordenante = transferencia.getOrdenante();
		ordenante = clienteService.leerClientePorId(ordenante.getId()).orElse(null);
		ordenante.setPassword(null);
		Cliente beneficiario = transferencia.getBeneficiario();
		Double saldoBeneficiario = beneficiario.getSaldo();
		Double saldoOrdenante = ordenante.getSaldo();

		ordenante.setSaldo(saldoOrdenante - importe);
		beneficiario.setSaldo(saldoBeneficiario + importe);

		clienteService.guardarCliente(ordenante);
		clienteService.guardarCliente(beneficiario);

		return transferencia;
	}

	// Borrar transferencia por ID
	public void borrarTransferenciaPorId(Integer id) {
		this.transferenciaRepository.deleteById(id);
		;
	}

	// Leer transferencia por ID ordenante
	public Optional<Transferencia> buscarTransferenciaPorIdOrdenante(Integer ordenante) {
		return this.transferenciaRepository.findFirstByOrdenanteId(ordenante);
	}

	// Leer transferencia por ID beneficiario
	public Optional<Transferencia> buscarTransferenciaPorIdBeneficiario(Integer beneficiario) {
		return this.transferenciaRepository.findFirstByBeneficiarioId(beneficiario);
	}

}
