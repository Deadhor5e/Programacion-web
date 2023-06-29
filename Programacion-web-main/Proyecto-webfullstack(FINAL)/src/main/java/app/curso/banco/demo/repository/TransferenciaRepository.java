package app.curso.banco.demo.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import app.curso.banco.demo.model.Transferencia;

@Repository
public interface TransferenciaRepository extends CrudRepository<Transferencia, Long> {
	
	public ArrayList<Transferencia> findByClienteOrdenanteId(Long id);
	public ArrayList<Transferencia> findByClienteDestinoId(Long id);

}
