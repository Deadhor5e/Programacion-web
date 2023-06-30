package com.banco.bancobackend.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bancobackend.model.Cliente;
import com.banco.bancobackend.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	// Obtener todos los clientes
	public ArrayList<Cliente> leerClientes() {
		return (ArrayList<Cliente>) this.clienteRepository.findAll();
	}
	
	// Leer cliente
	public Optional<Cliente> leerClientePorId(Integer id) {
		return this.clienteRepository.findById(id);
	}
	
	// Guardar (crear o actualizar) un cliente y lo devuelve con ID
	public Cliente guardarCliente(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	// Borrar cliente por ID
	public void borrarClientePorId(Integer id) {
		this.clienteRepository.deleteById(id);
	}
	
	// Leer cliente por correo
	public Optional<Cliente> buscarClientePorCorreo(String correo) {
		return this.clienteRepository.findFirstByCorreo(correo);
	}

	// Leer gestor por correo y contraseña
	public Optional<Cliente> buscarClientePorCorreoYPass(String correo, String password) {
		return this.clienteRepository.findFirstByCorreoAndPassword(correo, password);
	}

}
