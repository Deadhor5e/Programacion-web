package com.banco.bancobackend.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.bancobackend.model.Mensaje;
import com.banco.bancobackend.service.MensajeService;

@RestController
@RequestMapping("/mensaje")
public class MensajeController {

	@Autowired
	MensajeService mensajeService;

	// Indica que recibirá una petición GET en "/mensaje"
	@GetMapping()
	public ArrayList<Mensaje> obtenerMensajes() {
		return this.mensajeService.leerMensajes();
	}

	// Indica que recibirá una petición POST en "/mensaje"
	// Recibirá el mensaje en el body de la petición (@RequestBody)
	@PostMapping()
	public Mensaje guardarMensaje(@RequestBody Mensaje mensaje) {
		return this.mensajeService.guardarMensaje(mensaje);
	}

	@GetMapping(path = "/mensaje/{id}")
	public Optional<Mensaje> obtenerMensaje(@PathVariable("id") Integer id) {
		return this.mensajeService.leerMensajePorId(id);
	}

	// IdOrigen
	@GetMapping(path = "/mensaje/{origen}")
	public Optional<Mensaje> obtenerMensajePorIdOrigen(@PathVariable("origen") Integer origen) {
		return this.mensajeService.buscarMensajePorIdOrigen(origen);
	}

	// IdDestino
	@GetMapping(path = "/mensaje/{destino}")
	public Optional<Mensaje> obtenerMensajePorIdDestino(@PathVariable("destino") Integer destino) {
		return this.mensajeService.buscarMensajePorIdDestino(destino);
	}

	@DeleteMapping(path = "/{id}")
	public void borrarMensaje(@PathVariable("id") Integer id) {
		this.mensajeService.borrarMensajePorId(id);
	}

}
