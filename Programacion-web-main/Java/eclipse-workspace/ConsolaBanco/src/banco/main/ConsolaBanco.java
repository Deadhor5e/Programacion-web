package banco.main;

import app_banco.modelos.Gestor;
import app_banco.modelos.Cliente;
import app_banco.modelos.Transferencia;
import banco.util.Utiles;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsolaBanco {

	public ConsolaBanco() {
	}

	public static void main(String[] args) {

		List<Gestor> gestores = new ArrayList<>();
		Integer siguienteIdGestor = 1;

		Scanner teclado = new Scanner(System.in);

		int opcionMain = -1;
		int opcionGestores = -1;

		do { // Main menu
			System.out.println("-----------------------");
			System.out.println("Seleciona una opción: \n");
			System.out.println("1. Gestores.");
			System.out.println("2. Clientes.");
			System.out.println("3. Transferencias.");
			System.out.println("4. Mensajes.");
			System.out.println("0. Salir.");
			System.out.println("-----------------------");
			opcionMain = teclado.nextInt();

			switch (opcionMain) {
			case 1: // Menu gestores
				System.out.println("-----------------------");
				System.out.println("Menú gestores: \n");
				System.out.println("1. Nuevo gestor.");
				System.out.println("2. Insertar multiples gestores.");
				System.out.println("3. Consultar gestor.");
				System.out.println("4. Mostrar gestores.");
				System.out.println("5. Modificar gestore.");
				System.out.println("6. Eliminar gestor.");
				System.out.println("0. Salir.");
				System.out.println("-----------------------");
				opcionGestores = teclado.nextInt();

				switch (opcionGestores) {
				case 1: // Crear gestor
					System.out.println("Nombre: ");
					String nombreGestor = teclado.next();
					System.out.println("Contraseña: ");
					String passwordGestor = teclado.next();
					System.out.println("Correo: ");
					String correoGestor = teclado.next();
					Gestor nuevoGestor = new Gestor(siguienteIdGestor, nombreGestor, passwordGestor, correoGestor);
					gestores.add(nuevoGestor);
					siguienteIdGestor++;
					System.out.println("-----------------------");
					System.out.println("Nuevo gestor \nCreado correctamente!!!");
					System.out.println("-----------------------");
					System.out.println(nuevoGestor);
					break;
				case 2: // Insetar multiples gestores
					System.out.println("-----------------------");
					System.out.println("Creando 10 nuevos gestores");
					System.out.println("-----------------------");

					for (int i = 0; i < 10; i++) {
						String nombreGestores = Utiles.nombreAleatorio();
						String correoGestores = Utiles.correoAleatorio();
						String passwordGetores = Utiles.nombreAleatorio();
						Gestor gestor = new Gestor(siguienteIdGestor, nombreGestores, passwordGetores, correoGestores);
						gestores.add(gestor);
						siguienteIdGestor++;
					}
					break;
				case 3: // Obtener un único gestor
					System.out.println("ID gestor: ");
					int idGestor = teclado.nextInt();
					Gestor gestorResultado = null;

					for (int i = 0; i < gestores.size(); i++) {
						Gestor gestor = gestores.get(i);
						if (gestor.getId() == idGestor) {
							gestorResultado = gestor;
							break;
						}
					}
					if (gestorResultado != null) {
						System.out.println(gestorResultado);
					} else {
						System.out.println("No se ha podido encontrar el getor. ID: " + idGestor + ".");
					}
					break;
				case 4: // Consultar todos los gestores
					System.out.println(gestores);
					break;
				case 5: // Modificar un gestor
					System.out.println("ID gestor: ");
					int idGestor5 = teclado.nextInt();
					Gestor gestorResultado5 = null;
					int posicionGestor5 = -1;

					for (int i = 0; i < gestores.size(); i++) {
						Gestor gestor = gestores.get(i);
						if (gestor.getId() == idGestor5) {
							gestorResultado5 = gestor;
							posicionGestor5 = i;
							break;
						}
					}
					if (gestorResultado5 != null) {
						System.out.println("[n] Nombre: ");
						System.out.println("[e] Email: ");
						System.out.println("[c] Contraseña: ");
						System.out.println("[x] Cancelar: ");
						System.out.println("Campo a actualiar: ");
						char opcionActualizada5 = teclado.next().charAt(0);
						switch (opcionActualizada5) {
						case 'n':
							System.out.println("Nombre: ");
							String nombre5 = teclado.next();
							gestorResultado5.setUsuario(nombre5);
							break;
						default:
							System.out.println("Opción no válida");
					}
						System.out.println("Gestor actualizado. ID: " + idGestor5);
					} else {
						System.out.println("No se ha podido encontrar el getor. ID: " + idGestor5 + ".");
					}
					break;
				case 6: // Eliminar un gestor
					System.out.println("ID gestor: ");
					int idGestor6 = teclado.nextInt();
					Gestor gestorResultado6 = null;
					int posicionGestor6 = -1;

					for (int i = 0; i < gestores.size(); i++) {
						Gestor gestor = gestores.get(i);
						if (gestor.getId() == idGestor6) {
							gestorResultado6 = gestor;
							posicionGestor6 = i;
							break;
						}
					}
					if (gestorResultado6 != null) {
						gestores.remove(posicionGestor6);
						System.out.println("Gestor eliminado. ID: " + idGestor6);
					} else {
						System.out.println("No se ha podido encontrar el getor. ID: " + idGestor6 + ".");
					}
					break;
				case 0:
					System.out.println("Hasta la próxima!\n");
					break;
				default:
					System.out.println("Opción no válida");
				}
				break;

			default:
				System.out.println("Opcion desconocida...\n");
			}
		} while (opcionMain != 0);
	}

}
