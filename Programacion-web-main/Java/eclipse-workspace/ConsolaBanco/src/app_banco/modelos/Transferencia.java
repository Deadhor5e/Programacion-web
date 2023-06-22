package app_banco.modelos;

import java.util.Date;

public class Transferencia {
	
	private Integer id;
	private Integer idOrdenante;
	private Integer idBenecifiario;
	private double importe;
	private String concepto;
	private Date fecha;
	
	public Transferencia() {}

	public Transferencia(Integer id, Integer idOrdenante, Integer idBenecifiario, double importe, String concepto) {

		this.id = id;
		this.idOrdenante = idOrdenante;
		this.idBenecifiario = idBenecifiario;
		this.importe = importe;
		this.concepto = concepto;
		this.fecha = new Date();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdOrdenante() {
		return idOrdenante;
	}

	public void setIdOrdenante(Integer idOrdenante) {
		this.idOrdenante = idOrdenante;
	}

	public Integer getIdBenecifiario() {
		return idBenecifiario;
	}

	public void setIdBenecifiario(Integer idBenecifiario) {
		this.idBenecifiario = idBenecifiario;
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
	
	//toString
	public String toString() {
		String textoTransferencia = "ID: " + this.id + "\nID Ordenante: " + this.idOrdenante + "\nID Beneficiario: " + this.idBenecifiario + "\nImporte: " + this.importe + "€" + "\nConcepto: " + this.concepto + "\nFecha: " + this.fecha;
		return textoTransferencia;
	}
	
	//equals
	public boolean equals(Object o) {
		Transferencia t = (Transferencia) o;
		return this.id == t.id;
	}

}
