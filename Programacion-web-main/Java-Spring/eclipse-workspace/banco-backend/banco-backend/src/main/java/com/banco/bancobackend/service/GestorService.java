package com.banco.bancobackend.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	    String pass = gestor.getPassword();
	    if (pass != null) {
	        // Inicializar encriptado
	        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	        
	        // Encriptar la contraseña
	        String encryptedPassword = encoder.encode(pass);
	        
	        // Asignar la contraseña encriptada al gestor
	        gestor.setPassword(encryptedPassword);
	    } else {
	    	Gestor gestorExistente =  leerGestorPorId(gestor.getId()).orElse(null);
	    	if (gestorExistente!=null) {
	    		gestor.setPassword(gestorExistente.getPassword());
	    	}
	    }
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
		Optional<Gestor> gestor = buscarGestorPorCorreo(correo);
		if (gestor.isPresent()) {
			Gestor gestorEncontrado = gestor.get();
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if (encoder.matches(password, gestorEncontrado.getPassword())) {
				return gestor;
			}
		}
		return null;
	}
}
