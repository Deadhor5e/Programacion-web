package app.curso.banco.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.curso.banco.demo.model.Gestor;

@Repository
public interface GestorRepository extends CrudRepository<Gestor, Long> {
	
	public Optional<Gestor> findByMail(String mail);
	
	public Optional<Gestor> findByMailAndPassword(String mail, String password);

}
