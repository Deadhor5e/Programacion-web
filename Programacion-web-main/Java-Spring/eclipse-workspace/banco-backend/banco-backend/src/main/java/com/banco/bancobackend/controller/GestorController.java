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
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping(path = "/{id}")
	public Optional <Gestor> obtenerGestor(@PathVariable("id") Integer id) {
		return this.gestorService.leerGestorPorId(id);
	}
	
	@GetMapping(path = "/correo/{correo}")
	public Optional<Gestor> obtenerGestorPorCorreo(@PathVariable("correo") String correo) {
		return this.gestorService.buscarGestorPorCorreo(correo);
	}
	
	@GetMapping(path = "/login")
	public Optional<Gestor> loguearGestor(@RequestParam("correo") String correo,@RequestParam("password") String password) {
		return this.gestorService.buscarGestorPorCorreoYPass(correo,password);
	}
	
	@DeleteMapping(path = "/{id}")
	public void borrarGestor(@PathVariable("id") Integer id) {
		this.gestorService.borrarGestorPorId(id);
	}
	

}
