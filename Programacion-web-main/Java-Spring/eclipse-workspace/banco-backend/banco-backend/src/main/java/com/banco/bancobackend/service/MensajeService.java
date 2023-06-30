package com.banco.bancobackend.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bancobackend.model.Mensaje;
import com.banco.bancobackend.repository.MensajeRepository;

@Service
public class MensajeService {

	@Autowired
	MensajeRepository mensajeRepository;

	// Obtener todos los mensajes
	public ArrayList<Mensaje> leerMensajes() {
		return (ArrayList<Mensaje>) this.mensajeRepository.findAll();
	}

	// Leer mensaje
	public Optional<Mensaje> leerMensajePorId(Integer id) {
		return this.mensajeRepository.findById(id);
	}

	// Guardar (crear o actualizar) un mensaje y lo devuelve con ID
	public Mensaje guardarMensaje(Mensaje mensaje) {
		return this.mensajeRepository.save(mensaje);
	}

	// Borrar mensaje por ID
	public void borrarMensajePorId(Integer id) {
		this.mensajeRepository.deleteById(id);;
	}

	// Leer mensaje por ID origen
	public Optional<Mensaje> buscarMensajePorIdOrigen(Integer origen) {
		return this.mensajeRepository.findFirstByOrigenId(origen);
	}
	
	// Leer mensaje por ID destino
	public Optional<Mensaje> buscarMensajePorIdDestino(Integer destino) {
		return this.mensajeRepository.findFirstByDestinoId(destino);
	}


}
