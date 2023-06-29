package app_banco.modelos;

import java.util.Date;

public class Mensaje {
	
	private Integer id;
	private Integer idOrigen;
	private Integer idDestino;
	private String texto;
	private String fecha;

	public Mensaje() {}
	
	public Mensaje(Integer id, Integer idOrigen, Integer idDestino, String texto, String fecha) {
		
		this.id = id;
		this.idOrigen = idOrigen;
		this.idDestino = idDestino;
		this.texto = texto;
		this.fecha = fecha;
		
		
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdOrigen() {
		return idOrigen;
	}

	public void setIdOrigen(Integer idOrigen) {
		this.idOrigen = idOrigen;
	}

	public Integer getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(Integer idDestino) {
		this.idDestino = idDestino;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	//toString
	public String toString() {
		String textoMensaje = "\nID: " + this.id + "\nID Origen: " + this.idOrigen + "\nID Destino: " + this.idDestino + "\nMensaje: " + this.texto + "\nFecha: " + this.fecha + "\n";
		return textoMensaje;
	}
	
	//equals
	public boolean equals(Object o) {
		Mensaje m = (Mensaje) o;
		return this.id == m.id;
	}

}
