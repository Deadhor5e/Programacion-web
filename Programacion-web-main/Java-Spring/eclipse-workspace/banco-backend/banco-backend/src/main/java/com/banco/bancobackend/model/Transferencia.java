package com.banco.bancobackend.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

@Entity
public class Transferencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Cliente ordenante;
	@ManyToOne
	private Cliente beneficiario;
	private double importe;
	private String concepto;
	private Date fecha;

	public Transferencia() {
	}
	
	@PrePersist
	private void antesDeGuardar() {
		if (this.fecha == null) {
			this.fecha = new Date();
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getOrdenante() {
		return ordenante;
	}

	public void setOrdenante(Cliente ordenante) {
		this.ordenante = ordenante;
	}

	public Cliente getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Cliente beneficiario) {
		this.beneficiario = beneficiario;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
