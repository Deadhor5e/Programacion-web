package listas;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public Main2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		List<Integer> listaNumeros = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			listaNumeros.add(i);
		}

		System.out.println(listaNumeros);
		
		//Recorremos la lista y actualizamos cada numero x2
		for (int i = 0; i < listaNumeros.size(); i++) {
			Integer elementoEnI = listaNumeros.get(i);
			elementoEnI = 2*elementoEnI;
			listaNumeros.set(i, elementoEnI);
		}
		
		System.out.println(listaNumeros);
		
		for (int i = listaNumeros.size() -1; i < 20; i++) {
			int x = 1;
			listaNumeros.add(listaNumeros.size() + x);
			x++;
		}
		
		System.out.println(listaNumeros);
		

	}

}
