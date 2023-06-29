package app.curso.banco.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import app.curso.banco.demo.model.Transferencia;
import app.curso.banco.demo.repository.TransferenciaRepository;

@Service
public class TransferenciaServicio {
	
	@Autowired
	TransferenciaRepository transferenciaRepository;
	
	public ArrayList<Transferencia> obtenerTransferencias(){
		
		return (ArrayList<Transferencia>) this.transferenciaRepository.findAll();
		
	}
	
	public Optional<Transferencia> obtenerTransferencia(Long id){
		
		return this.transferenciaRepository.findById(id);
		
	}
	
	public Transferencia guardarTransferencia(Transferencia transferencia) {
		
		return this.transferenciaRepository.save(transferencia);
		
	}
	
	public boolean borrarTransferencia(Long id) {
		
		try {
			
			this.transferenciaRepository.deleteById(id);
			
			return true;
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public ArrayList<Transferencia> obtenerTransferenciaDestinoPorCliente(Long id){
		
		return this.transferenciaRepository.findByClienteDestinoId(id);
		
	}
	
	public ArrayList<Transferencia> obtenerTransferenciaOrigenPorCliente(Long id){
		
		return this.transferenciaRepository.findByClienteOrdenanteId(id);
		
	}

}
