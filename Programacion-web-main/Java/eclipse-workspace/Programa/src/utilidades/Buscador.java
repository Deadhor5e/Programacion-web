package utilidades;

import java.util.ArrayList;
import java.util.List;

public class Buscador {

	public Buscador() {
	}

	public static boolean buscarNumero(List<Integer> numeros, Integer objetivo) {

		for (int i = 0; i < numeros.size(); i++) {
			int numero = numeros.get(i);
			if (numero == objetivo) {
				return true;
			}
		}
		// Si no se ha retornado nada antes, se retorna False
		return false;

	}

	public static List<Integer> reemplazarNumeros(List<Integer> numeros, Integer objetivo, Integer nuevoNumero) {

		for (int i = 0; i < numeros.size(); i++) {
			int numero = numeros.get(i);
			if (numero == objetivo) {
				numeros.set(i, nuevoNumero);
			}
		}
		return numeros;
	}

	public static int posicionNumeros(List<Integer> numeros, Integer objetivo) {
		int posicion = -1;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == objetivo) {
				posicion = i+1;
				break;
			}
		}
		return posicion;
	}
}
