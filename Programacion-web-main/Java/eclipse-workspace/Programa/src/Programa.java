
public class Programa {

	public static void main(String[] args) {

		boolean verdadero = true;
		boolean falso = false;

		String unTexto = "Hello World";
		String unTexto2 = "Fuck off world";

		System.out.println(unTexto);
		System.out.println(unTexto2);

		int a = 1;
		int b = 3;

		int suma = a + b;

		System.out.println("Suma: " + suma);

		double c = 2.1;

		double suma2 = a + c;

		System.out.println("Suma2: " + suma2);

		int edad = 15;

		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

		int mes = 3;

		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		default:
			System.out.println("Mes desconocido");
			break;
		}

		int i = 0;

		while (i < 10) {
			System.out.println("Iteración " + i);
			i++;
		}

		for (int x = 0; x < 10; x++) {
			System.out.println("Iteración " + x);
		}

		int lista2[] = new int[3]; // [ 0, 0, 0]

		lista2[0] = 6; // [6, 0, 0]
		lista2[1] = 3; // [6, 3, 0]
		lista2[2] = -5; // [6, 3, -5]

		Persona persona1 = new Persona();

		int edadPersona = persona1.getEdad();

		//System.out.println("La edad es " + edadPersona);

		persona1.setEdad(1);

		//System.out.println("Ahora la edad es " + persona1.getEdad());
		
		persona1.setNombre("Ana López");
		
		persona1.saludar();
		
		Persona paco = new Persona(27, "Paco Martínez");
		
		paco.saludar();
		
		new Rectangulo(14.15, 16.27);
		new Rectangulo();
		
		Rectangulo r1 = new Rectangulo();
		
		//System.out.println(r1.areaRectangulo(20.20, 30.30));
		
		Rectangulo r2 = new Rectangulo();
		
		//System.out.println(r2.perimetroRectangulo(5, 10));
		
		Rectangulo rectangulo = new Rectangulo();
		
		rectangulo.dibujarRectangulo();
		
		Rectangulo rectangulo2 = new Rectangulo(2,1);
		
		rectangulo2.dibujarRectangulo();
		
		Rectangulo rectangulo3 = new Rectangulo(3,1);
		
		rectangulo3.dibujarRectangulo();
	}
}