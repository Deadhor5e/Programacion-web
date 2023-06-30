package scanner;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numeroObjetivo = (int) (Math.random()*10);

		int numeroUsuario = -1;

		do {
			System.out.print("Introduce un número: ");
			numeroUsuario = teclado.nextInt();
			if (numeroObjetivo != numeroUsuario) {
				System.out.println("Inténtalo otra vez...");
			} else {
				System.out.println("Correcto!");
			}

		} while (numeroObjetivo != numeroUsuario);

	}

}