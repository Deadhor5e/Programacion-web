package listas;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosListas {

	public EjerciciosListas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int numeroObjetivo = 5;

		List<Integer> numeros = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			numeros.add((int) (Math.random() * 10 + 1));
		}

		// 1.
		// Buscar el numeroObjetivo
		// Imprimir "Found it!" si está presente

		System.out.println("\n------------Ejercicio-1-----------");
		System.out.println(numeros);

		int x = 0;
		boolean foundIt = false;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == numeroObjetivo) {
				foundIt = true;
				x++;
			}
		}

		if (foundIt) {
			System.out.println("Found it! x" + x + " times");
		} else {
			System.out.println("numeroObjetivo not found");
		}

		// 2.
		// Buscar numeroObjetivo
		// Remplazarlo en cada aparición por nuevoNumero
		int numeroNuevo = 80;

		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == numeroObjetivo) {
				numeros.set(i, numeroNuevo);
			}
		}

		System.out.println("\n------------Ejercicio-2-----------");
		System.out.println(numeros);

		// 3.
		//Buscar palabraObjetivo

		System.out.println("\n------------Ejercicio-3-----------");

		List<String> palabras = new ArrayList<>();
		palabras.add("Casa");
		palabras.add("Elefante");
		palabras.add("Coche");
		palabras.add("Flor");
		palabras.add("Globo");
		
		String palabraObjetivo = "Globo";

		System.out.println("Buscando " + palabraObjetivo + " en: " + palabras);
		
		int position = 0;
		foundIt = false;
		for (int i = 0; i < palabras.size(); i++) {
			if (palabras.get(i) == palabraObjetivo) {
				foundIt = true;
				position = i+1;
			}
		}

		if (foundIt) {
			System.out.println("Found it! Position: " + position);
		} else {
			System.out.println("palabraObjetivo not found");
		}

	}

}
