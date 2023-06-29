package app.curso.banco.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.curso.banco.demo.model.Gestor;
import app.curso.banco.demo.repository.GestorRepository;

@Service
public class GestorServicio {
	
	@Autowired
	GestorRepository gestorRepository;

	public ArrayList<Gestor> obtenerGestores(){
		
		return (ArrayList<Gestor>) this.gestorRepository.findAll();
		
	}
	
	public Optional<Gestor> obtenerGestor(Long id) {
		
		return this.gestorRepository.findById(id);
		
		
	}
	
	public Optional<Gestor> buscarPorCorreo(String mail){
		
		return this.gestorRepository.findByMail(mail);
		
	}
	
	public Optional<Gestor> obtenerLogin(String mail, String password){
		
		return this.gestorRepository.findByMailAndPassword(mail, password);
		
	}

//crea un gestor si no tiene ID y actualiza el gestor si le pasamos un ID existente
	public Gestor guardarGestor(Gestor gestor) {
		
		return this.gestorRepository.save(gestor);
		
	}
	
	public boolean borrarGestor(Long id) {
		
		try {
			
			this.gestorRepository.deleteById(id);
			
			return true;
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}

}
