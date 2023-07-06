package com.banco.bancobackend.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banco.bancobackend.model.Cliente;
import com.banco.bancobackend.service.ClienteService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	//Indica que recibirá una petición GET en "/cliente"
	@GetMapping()
	public ArrayList<Cliente> obtenerClientes() {
		return this.clienteService.leerClientes();
	}
	
	//Indica que recibirá una petición POST en "/cliente"
	//Recibirá el cliente en el body de la petición (@RequestBody)
	@PostMapping()
	public Cliente guardarCliente(@RequestBody Cliente cliente) {
		return this.clienteService.guardarCliente(cliente);
	}
	
	@GetMapping(path = "/{id}")
	public Optional <Cliente> obtenerCliente(@PathVariable("id") Integer id) {
		return this.clienteService.leerClientePorId(id);
	}
	
	@GetMapping(path = "/correo/{correo}")
	public Optional<Cliente> obtenerClientePorCorreo(@PathVariable("correo") String correo) {
		return this.clienteService.buscarClientePorCorreo(correo);
	}
	
	@GetMapping(path = "/login")
	public Optional<Cliente> loguearCliente(@RequestParam String correo,@RequestParam String password) {
		return this.clienteService.buscarClientePorCorreoYPass(correo,password);
	}

	
	@DeleteMapping(path = "/{id}")
	public void borrarCliente(@PathVariable("id") Integer id) {
		this.clienteService.borrarClientePorId(id);
	}

}
