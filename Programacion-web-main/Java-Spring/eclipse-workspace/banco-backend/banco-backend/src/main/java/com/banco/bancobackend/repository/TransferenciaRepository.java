package com.banco.bancobackend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.bancobackend.model.Transferencia;



public interface TransferenciaRepository extends JpaRepository<Transferencia, Integer> {
		
	public Optional<Transferencia> findFirstByOrdenanteId(Integer ordenante);

	public Optional<Transferencia> findFirstByBeneficiarioId(Integer beneficiario);
}
