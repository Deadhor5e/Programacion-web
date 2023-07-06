package com.banco.bancobackend.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.bancobackend.model.Transferencia;
import com.banco.bancobackend.service.TransferenciaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {
	
	@Autowired
	TransferenciaService transferenciaService;

	// Indica que recibirá una petición GET en "/trandferencia"
	@GetMapping()
	public ArrayList<Transferencia> obtenerTransferencia() {
		return this.transferenciaService.leerTransferencias();
	}

	// Indica que recibirá una petición POST en "/transferencia"
	// Recibirá la trasnferencia en el body de la petición (@RequestBody)
	@PostMapping
	public Transferencia guardarTransferencia(@RequestBody Transferencia trasnferencia) {
		return this.transferenciaService.guardarTransferencia(trasnferencia);
	}

	@GetMapping(path = "/trasnferencia/{id}")
	public Optional<Transferencia> obtenerTransferencia(@PathVariable("id") Integer id) {
		return this.transferenciaService.leerTransferenciaPorId(id);
	}

	// IdOrigen
	@GetMapping(path = "/trasnferencia/{ordenante}")
	public Optional<Transferencia> obtenerTransferenciaPorIdOrdenante(@PathVariable("ordenante") Integer ordenante) {
		return this.transferenciaService.buscarTransferenciaPorIdOrdenante(ordenante);
	}

	// IdDestino
	@GetMapping(path = "/trasnferencia/{beneficiario}")
	public Optional<Transferencia> obtenerTransferenciaPorIdBeneficiario(@PathVariable("beneficiario") Integer beneficiario) {
		return this.transferenciaService.buscarTransferenciaPorIdBeneficiario(beneficiario);
	}

	@DeleteMapping(path = "/{id}")
	public void borrarTransferencia(@PathVariable("id") Integer id) {
		this.transferenciaService.borrarTransferenciaPorId(id);
	}

}
