package com.banco.bancobackend.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bancobackend.model.Gestor;
import com.banco.bancobackend.repository.GestorRepository;

@Service
public class GestorService {
	
	@Autowired
	GestorRepository gestorRepository;
	
	//Obtener todos los gestores
	public ArrayList<Gestor> leerGetores() {
		return (ArrayList<Gestor>) this.gestorRepository.findAll();
	}
	
	//Guardar (crear o actualizar) un gestor y lo devuelve con ID
	public Gestor guardarGestor(Gestor gestor) {
		return this.gestorRepository.save(gestor);
	}

}
