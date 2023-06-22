package utilidades;

import java.util.ArrayList;
import java.util.List;

public class PruebaBuscador {

	public PruebaBuscador() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int numeroObjetivo = 5;

		List<Integer> numeros = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			numeros.add((int) (Math.random() * 10 + 1));
		}
		
		System.out.println(numeros);
		
		boolean encontrado = Buscador.buscarNumero(numeros, numeroObjetivo);
		
		System.out.println("Encontrado: " + encontrado);
		System.out.println("\n------------------------------\n");
		
		numeros = Buscador.reemplazarNumeros(numeros, 4, 20);
		System.out.println(numeros);
		
		System.out.println("\n------------------------------\n");
		
		int posicion = Buscador.posicionNumeros(numeros, 5);
		System.out.println(numeros);
		System.out.println("El numero objetivo se encuentra en la posición '" + posicion + "'.");

	}

}
