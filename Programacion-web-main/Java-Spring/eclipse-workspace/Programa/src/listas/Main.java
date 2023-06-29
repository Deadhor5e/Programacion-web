package listas;

import java.util.ArrayList;
import java.util.List;

import libros.Libros;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		List<String> listaTextos = new ArrayList<>();

		List<Integer> listaEnteros = new ArrayList<>();

		// Lista de listas de cadenas de texto
		List<List<String>> listaDeListas = new ArrayList<>();

		List<Libros> listaLibros = new ArrayList<>();

		// Añadir elemento a una lista
		listaTextos.add("Un texto");
		listaTextos.add("Otro texto");

		// Ver numero de elementos en una lista
		int numeroDeTextos = listaTextos.size();

		// Recuperar un elemento (en la posición 1, empezando desde 0)
		String segundoElemento = listaTextos.get(1);
		System.out.println("Lista sin modificar con : " + listaTextos.size() + " elementos" + listaTextos);

		// Modificar un elemento
		listaTextos.set(0, "Un texto 2");
		System.out.println("Lista modificada con : " + listaTextos.size() + " elementos" +  listaTextos);
		
		

	}

}
