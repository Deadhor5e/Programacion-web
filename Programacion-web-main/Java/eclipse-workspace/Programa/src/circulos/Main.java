package circulos;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Circulos circulo1 = new Circulos(15);
		Circulos circulo2 = new Circulos(5);
		Circulos circulo3 = new Circulos(12);
		
		System.out.println(circulo1);
		System.out.println(circulo2);
		System.out.println(circulo3);
		
		System.out.println("El area del circulo es: " + circulo1.calcularArea());
		System.out.println("El area del circulo es: " + circulo2.calcularArea());
		System.out.println("El area del circulo es: " + circulo3.calcularArea());

	}
}