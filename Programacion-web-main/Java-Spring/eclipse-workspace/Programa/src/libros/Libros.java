package libros;

//Clase con atributos
//titulo
//autor
//publicacion
//
//Contructor que inicialicen los atributos
//metodo consultor y modificadores
//metodo obtenerInformación() que muestre toda la info del libro
//sobreescribir el metodo "equals" para poder comparar libros
//en la clase Main probar los metodos con objetos Libro

public class Libros {
	
	private String titulo;
	private String autor;
	private  int publicacion;

	public Libros(){}
	
	public Libros(String titulo, String autor, int publicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.publicacion = publicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(int publicacion) {
		this.publicacion = publicacion;
	}
	
	public String toString() {
		String textoLibro = "Titulo: " + this.titulo + ", Autor: " + this.autor + ", Año de publicación: " + this.publicacion + ".";
		return textoLibro;
	}
	
	public void obtenerInformacion() {
		;
	}
	
	public boolean equals(Object o) {
		Libros libro = (Libros) o;
		boolean mismoTitulo = this.titulo == libro.titulo;
		return mismoTitulo;
	}
	
}