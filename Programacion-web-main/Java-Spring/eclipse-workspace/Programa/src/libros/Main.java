package libros;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Libros libro1 = new Libros("El arte de la guerra", "Sun-Tzu", 1080);
		Libros libro2 = new Libros("Orgullo y prejuicio", "Jane Austen", 1813);
		Libros libro3 = new Libros("Harry Potter y la piedra filosofal", "J. K. Rowling", 1997);
		Libros libro4 = new Libros();

		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println(libro3);
		System.out.println(libro4);
	}

}