package app.curso.banco.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "mensaje")
public class Mensaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String texto;
	
	@CreationTimestamp
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name = "id_origen", nullable = false)
	private Gestor gestorOrigen;
	
	@ManyToOne
	@JoinColumn(name = "id_destino", nullable = false)
	private Gestor gestorDestino;
	
	public Mensaje() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Gestor getGestorOrigen() {
		return gestorOrigen;
	}

	public void setGestorOrigen(Gestor gestorOrigen) {
		this.gestorOrigen = gestorOrigen;
	}

	public Gestor getGestorDestino() {
		return gestorDestino;
	}

	public void setGestorDestino(Gestor gestorDestino) {
		this.gestorDestino = gestorDestino;
	}
	
	

}
