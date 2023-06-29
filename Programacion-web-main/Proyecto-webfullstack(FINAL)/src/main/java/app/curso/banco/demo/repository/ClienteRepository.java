package app.curso.banco.demo.repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.curso.banco.demo.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	
	public Optional<Cliente> findByMail(String mail);
	
	public Optional<Cliente> findByMailAndPassword(String mail, String password);
	
	public ArrayList<Cliente> findByGestorId(Long id);

}
