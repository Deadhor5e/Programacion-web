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
@Table(name = "transferencia")
public class Transferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String concepto;
	private double importe;
	
	@CreationTimestamp
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name = "id_ordenante", nullable = false)
	private Cliente clienteOrdenante;
	
	@ManyToOne
	@JoinColumn(name = "id_destino", nullable = false)
	private Cliente clienteDestino;
	
	public Transferencia() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getClienteOrdenante() {
		return clienteOrdenante;
	}

	public void setClienteOrdenante(Cliente clienteOrdenante) {
		this.clienteOrdenante = clienteOrdenante;
	}

	public Cliente getClienteDestino() {
		return clienteDestino;
	}

	public void setClienteDestino(Cliente clienteDestino) {
		this.clienteDestino = clienteDestino;
	}
	
	

}
