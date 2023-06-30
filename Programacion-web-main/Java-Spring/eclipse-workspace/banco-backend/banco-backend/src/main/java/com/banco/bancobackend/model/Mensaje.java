package com.banco.bancobackend.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

@Entity
public class Mensaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Gestor origen;
	@ManyToOne
	private Gestor destino;
	private String text;
	private Date fecha;

	public Mensaje() {

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

	public Gestor getGestorOrigen() {
		return origen;
	}

	public void setGestorOrigen(Gestor gestorOrigen) {
		this.origen = gestorOrigen;
	}

	public Gestor getGestorDestino() {
		return destino;
	}

	public void setGestorDestino(Gestor gestorDestino) {
		this.destino = gestorDestino;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
