package app_banco.modelos;

					//Cliente:hijo > Usuario:padre
public class Cliente extends Usuario{
	
	private Integer id;
	private String usuario;
	private String password;
	private String correo;
	private Integer gestorId;
	private double saldo;

	public Cliente() {
		super();
	}
	
	public Cliente(Integer id, String usuario, String password, String correo, Integer gestorId, double saldo) {
		
		super(id, usuario, password, correo);
		
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
		this.gestorId = gestorId;
		this.saldo = saldo;
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

	public Integer getGestorId() {
		return gestorId;
	}

	public void setGestorId(Integer gestorId) {
		this.gestorId = gestorId;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//toString
	public String toString() {
		String textoCliente = "\nID: " + this.id + "\nUsuario: " + this.usuario + "\nContraseña: " + this.password + "\nCorreo: " + this.correo + "\nID Gestor: " + this.gestorId + "\nSaldo: " + this.saldo + "€\n";
		return textoCliente;
	}
	
	//equals
	public boolean equals(Object o) {
		Cliente c = (Cliente) o;
		return this.id == c.id;
	}

}
