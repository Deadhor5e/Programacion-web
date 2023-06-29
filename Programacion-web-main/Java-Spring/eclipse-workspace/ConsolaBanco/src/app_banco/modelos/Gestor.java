package app_banco.modelos;

public class Gestor {

	private Integer id;
	private String usuario;
	private String password;
	private String correo;

	public Gestor() {
	}

	public Gestor(Integer id, String usuario, String password, String correo) {

		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	//toString
	public String toString() {
		String textoGestor = "\nID: " + this.id + "\nUsuario: " + this.usuario + "\nContraseña: " + this.password + "\nCorreo: " + this.correo + "\n";
		return textoGestor;
	}
	
	//equals
	public boolean equals(Object o) {
		Gestor g = (Gestor) o;
		return this.id == g.id;
	}
}
