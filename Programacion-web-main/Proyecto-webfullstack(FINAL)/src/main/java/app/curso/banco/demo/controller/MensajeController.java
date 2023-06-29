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


import app.curso.banco.demo.model.Mensaje;
import app.curso.banco.demo.service.MensajeServicio;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/mensaje")
public class MensajeController {

	@Autowired
	MensajeServicio mensajeServicio;
	
	@GetMapping()
	public ArrayList<Mensaje> obtenerMensajes(){
		
		return this.mensajeServicio.obtenerMensajes();
		
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Mensaje> obtenerMensaje(@PathVariable("id") Long id){
		
		return this.mensajeServicio.obtenerMensaje(id);
		
	}
	
	@PostMapping()
	public Mensaje guardarMensaje(@RequestBody Mensaje mensaje) {
		
		return this.mensajeServicio.guardarMensaje(mensaje);
		
	}
	
	@DeleteMapping(path = "/{id}")
	public boolean borrarMensaje(@PathVariable("id") Long id) {
		
		return this.mensajeServicio.borrarMensaje(id);
		
	}
	
	@GetMapping(path = "/mensajes-recibidos/{idGestor}")
	public ArrayList<Mensaje> obtenerMensajeDestinoPorGestor(@PathVariable("idGestor") Long id){
		
		return this.mensajeServicio.obtenerMensajeDestinoPorGestor(id);
		
	}
	
	@GetMapping(path = "/mensajes-enviados/{idGestor}")
	public ArrayList<Mensaje> obtenerMensajeOrigenPorGestor(@PathVariable("idGestor") Long id){
		
		return this.mensajeServicio.obtenerMensajeOrigenPorGestor(id);
		
	}
	
}
