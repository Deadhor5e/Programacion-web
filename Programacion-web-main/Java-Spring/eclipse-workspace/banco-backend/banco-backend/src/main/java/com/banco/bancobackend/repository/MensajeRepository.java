package com.banco.bancobackend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.bancobackend.model.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Integer> {

	public Optional<Mensaje> findFirstByOrigenId(Integer destino);

	public Optional<Mensaje> findFirstByDestinoId(Integer origen);

}