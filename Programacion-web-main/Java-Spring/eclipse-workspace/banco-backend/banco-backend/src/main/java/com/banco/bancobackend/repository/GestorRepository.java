package com.banco.bancobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.bancobackend.model.Gestor;

public interface GestorRepository extends JpaRepository<Gestor, Integer>{
	
}
