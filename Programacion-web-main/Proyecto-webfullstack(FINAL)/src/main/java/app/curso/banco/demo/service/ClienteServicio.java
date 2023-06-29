package app.curso.banco.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.curso.banco.demo.model.Cliente;
import app.curso.banco.demo.repository.ClienteRepository;

@Service
public class ClienteServicio {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public ArrayList<Cliente> obtenerClientes(){
		
		return (ArrayList<Cliente>) this.clienteRepository.findAll();
		
		
	}
	
	public Optional<Cliente> obtenerCliente(Long id){
		
		return this.clienteRepository.findById(id);
		
	}
	
	public Cliente guardarCliente(Cliente cliente) {
		
		return this.clienteRepository.save(cliente);
		
	}
	
	public boolean borrarCliente(Long id) {
		
		try {
			
			this.clienteRepository.deleteById(id);
			
			return true;
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
			return false;
		}
		
	}
	
	public ArrayList<Cliente> obtenerClientePorGestor(Long id){
		
		return this.clienteRepository.findByGestorId(id);
		
	}

}
