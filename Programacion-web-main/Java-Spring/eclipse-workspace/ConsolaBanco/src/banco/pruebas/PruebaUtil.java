package banco.pruebas;

import java.util.ArrayList;
import java.util.List;

import app_banco.modelos.Gestor;
import banco.util.Utiles;

public class PruebaUtil {

	public PruebaUtil() {}

	public static void main(String[] args) {
		
		//Mostrar nombres y apellidos aleatorios
		String nombreAleatorio = Utiles.nombreAleatorio(Utiles.NOMBRES, Utiles.APELLIDOS);
		String mensajeNombre = "Nombre Aleatorio: ";
		System.out.println( mensajeNombre + nombreAleatorio);
		
		//Mostrar correo partido en 2 partes aleatorio
		String correoAleatorio = Utiles.correoAleatorio(Utiles.NOMBRES, Utiles.APELLIDOS, Utiles.CORREOS2);
		String mensajeCorreo = "Correo Aleatorio: ";
		System.out.println(mensajeCorreo + correoAleatorio);
		
		// Guardar gestores
		List<Gestor> gestores = new ArrayList<>();

		for(int i = 0;i<5;i++)	{
			String usuario = Utiles.nombreAleatorio();
			String correo = Utiles.correoAleatorio();
			Gestor gestor = new Gestor(i + 1, usuario, "" ,correo);
			gestores.add(gestor);
		}
		
		System.out.println(gestores);
	}

}
