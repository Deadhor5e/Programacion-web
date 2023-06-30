package com.banco.bancobackend.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bancobackend.model.Gestor;
import com.banco.bancobackend.repository.GestorRepository;

@Service
public class GestorService {

	@Autowired
	GestorRepository gestorRepository;

	// Obtener todos los gestores
	public ArrayList<Gestor> leerGetores() {
		return (ArrayList<Gestor>) this.gestorRepository.findAll();
	}

	// Leer gestor
	public Optional<Gestor> leerGestorPorId(Integer id) {
		return this.gestorRepository.findById(id);
	}

	// Guardar (crear o actualizar) un gestor y lo devuelve con ID
	public Gestor guardarGestor(Gestor gestor) {
		return this.gestorRepository.save(gestor);
	}

	// Borrar gestor por ID
	public void borrarGestorPorId(Integer id) {
		this.gestorRepository.deleteById(id);
	}

	// Leer gestor por correo
	public Optional<Gestor> buscarGestorPorCorreo(String correo) {
		return this.gestorRepository.findFirstByCorreo(correo);
	}

	// Leer gestor por correo y contraseña
	public Optional<Gestor> buscarGestorPorCorreoYPass(String correo, String password) {
		return this.gestorRepository.findFirstByCorreoAndPassword(correo, password);
	}
}
