package app.curso.banco.demo.controller;

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

import app.curso.banco.demo.model.Cliente;
import app.curso.banco.demo.service.ClienteServicio;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/cliente")
public class ClienteController {

	@Autowired
	ClienteServicio clienteServicio;
	
	@GetMapping()
	public ArrayList<Cliente> obtenerClientes(){
		
		return this.clienteServicio.obtenerClientes();
		
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Cliente> obtenerCliente(@PathVariable("id") Long id) {
		
		return this.clienteServicio.obtenerCliente(id);
		
	}
	
	@PostMapping()
	public Cliente guardarCliente(@RequestBody Cliente cliente) {
		
		return this.clienteServicio.guardarCliente(cliente);
		
	}
	
	@DeleteMapping(path = "{id}")
	public boolean borrarCliente(@PathVariable("id") Long id) {
		
		return this.clienteServicio.borrarCliente(id);
		
	}
	
	@GetMapping(path = "/gestor/{idGestor}")
	public ArrayList<Cliente> obtenerClientePorGestor(@PathVariable("idGestor") Long id){
		
		return this.clienteServicio.obtenerClientePorGestor(id);
		
	}
	
	
	
}
