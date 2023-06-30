package com.banco.bancobackend.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bancobackend.model.Transferencia;
import com.banco.bancobackend.repository.TransferenciaRepository;

@Service
public class TransferenciaService {

	@Autowired
	TransferenciaRepository transferenciaRepository;
	
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
		return this.transferenciaRepository.save(transferencia);
	}

	// Borrar transferencia por ID
	public void borrarTransferenciaPorId(Integer id) {
		this.transferenciaRepository.deleteById(id);;
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
