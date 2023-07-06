package com.banco.bancobackend.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	    String pass = cliente.getPassword();
	    if (pass != null) {
	        // Inicializar encriptado
	        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	        
	        // Encriptar la contraseña
	        String encryptedPassword = encoder.encode(pass);
	        
	        // Asignar la contraseña encriptada al cliente
	        cliente.setPassword(encryptedPassword);
	    } else {
	    	Cliente clienteExistente =  leerClientePorId(cliente.getId()).orElse(null);
	    	if (clienteExistente!=null) {
	    		cliente.setPassword(clienteExistente.getPassword());
	    	}
	    }
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

	// Leer cliente por correo y contraseña
	public Optional<Cliente> buscarClientePorCorreoYPass(String correo, String password) {
		Optional<Cliente> cliente = buscarClientePorCorreo(correo);
		if (cliente.isPresent()) {
			Cliente clienteEncontrado = cliente.get();
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if (encoder.matches(password, clienteEncontrado.getPassword())) {
				return cliente;
			}
		}
		return null;
	}


}
