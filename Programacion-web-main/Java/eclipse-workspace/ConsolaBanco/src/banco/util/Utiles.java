package banco.util;

import java.util.Random;

import app_banco.modelos.Gestor;

import java.util.List;
import java.util.ArrayList;

public class Utiles {

	public static final String[] NOMBRES = { "Juan", "Antonio", "Paco", "Irene" };
	public static final String[] APELLIDOS = { "Perez", "Martin", "Lopez", "Gomez", "Uta", "Lama" };
	public static final String[] CORREOS2 = { "@hotmail.com", "@gmail.com", "@yahoo.com", "@hotmail.es", "@gmail.es",
			"@yahoo.es" };

	public Utiles() {
	}

	// Nombres y Apellidos aleatorios
	public static String nombreAleatorio(String[] nombres, String[] apellidos) {

		Random random = new Random();

		int indiceNombre = random.nextInt(nombres.length);
		String nombre = nombres[indiceNombre];

		int indiceApellido = random.nextInt(apellidos.length);
		String apellido = apellidos[indiceApellido];
		return nombre + " " + apellido;
	}

	public static String nombreAleatorio() {
		return nombreAleatorio(NOMBRES, APELLIDOS);
	}

	// Correo aleatorio
	public static String correoAleatorio(String[] nombres, String[] apellidos, String[] correos2) {

		Random random = new Random();

		int indiceNombre = random.nextInt(nombres.length);
		String nombre = nombres[indiceNombre];

		int indiceApellido = random.nextInt(apellidos.length);
		String apellido = apellidos[indiceApellido];

		int indiceCorreos2 = random.nextInt(correos2.length);
		String correo2 = correos2[indiceCorreos2];
		return nombre.toLowerCase() + "." + apellido.toLowerCase() + correo2;

	}

	public static String correoAleatorio() {
		return correoAleatorio(NOMBRES, APELLIDOS, CORREOS2);
	}

	

}
