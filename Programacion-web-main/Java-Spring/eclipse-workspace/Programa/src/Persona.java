
public class Persona {

	// Atributos o Propiedad de clase
	private int edad;
	private String nombre;
	private String domicilio;

	// Método constructor
	public Persona() {
		this.edad = 0;
		this.nombre = "Sin nombre";
	}

	// Podemos tener funciones con el mismo nombre y distintos parametros
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}

	// Método consultor
	public int getEdad() {
		return this.edad;
	}

	// Método modificador
	public void setEdad(int nuevaEdad) {
		this.edad = nuevaEdad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void saludar() {
		System.out.println("Hola me llamo " + this.nombre + " y tengo " + this.edad + " años");
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

}