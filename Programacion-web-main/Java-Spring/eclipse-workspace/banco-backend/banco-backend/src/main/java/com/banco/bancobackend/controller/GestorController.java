package com.banco.bancobackend.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.bancobackend.model.Gestor;
import com.banco.bancobackend.service.GestorService;

@RestController
@RequestMapping("/gestor")
public class GestorController {

	@Autowired
	GestorService gestorService;
	
	//Indica que recibirá una petición GET en "/gestor"
	@GetMapping()
	public ArrayList<Gestor> obtenerGestores() {
		return this.gestorService.leerGetores();
	}
	
	//Indica que recibirá una petición POST en "/gesto"
	//Recibirá el gestor en el body de la petición (@RequestBody)
	@PostMapping()
	public Gestor guardarGestor(@RequestBody Gestor gestor) {
		return this.gestorService.guardarGestor(gestor);
	}
	
}
