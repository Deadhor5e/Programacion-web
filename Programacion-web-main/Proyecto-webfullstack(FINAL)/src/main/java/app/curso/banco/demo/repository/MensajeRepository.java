package app.curso.banco.demo.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import app.curso.banco.demo.model.Mensaje;

@Repository
public interface MensajeRepository extends CrudRepository<Mensaje, Long> {
	
	public ArrayList<Mensaje> findByGestorOrigenId(Long id);
	public ArrayList<Mensaje> findByGestorDestinoId(Long id);

}
