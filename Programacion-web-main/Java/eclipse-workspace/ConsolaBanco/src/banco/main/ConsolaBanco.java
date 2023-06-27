package banco.main;

import app_banco.modelos.Gestor;
import app_banco.modelos.Cliente;
import app_banco.modelos.Transferencia;
import app_banco.modelos.Mensaje;
import banco.util.Utiles;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsolaBanco {

	public ConsolaBanco() {
	}

	public static void main(String[] args) {

		List<Gestor> gestores = new ArrayList<>();
		List<Cliente> clientes = new ArrayList<>();
		List<Transferencia> transferencias = new ArrayList<>();
		List<Mensaje> mensajes = new ArrayList<>();
		Integer siguienteIdGestor = 1;
		Integer siguienteIdCliente = 1;
		Integer siguienteIdTransferencia = 1;
		Integer siguienteIdMensaje = 1;

		Scanner teclado = new Scanner(System.in);
		
		int opcionMain = -1;
		int opcionGestores = -1;
		int opcionClientes = -1;
		int opcionTransferencias = -1;
		int opcionMensajes = -1;

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
				System.out.println("2. Insertar multiples gestores (x10).");
				System.out.println("3. Consultar gestor.");
				System.out.println("4. Mostrar gestores.");
				System.out.println("5. Modificar gestor.");
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
						System.out.println("Campo a actualiar: \n");
						System.out.println("[n] Nombre: ");
						System.out.println("[e] Email: ");
						System.out.println("[c] Contraseña: ");
						System.out.println("[x] Cancelar: ");

						char opcionActualizada5 = teclado.next().charAt(0);
						switch (opcionActualizada5) {
						case 'n':
							System.out.println("Nombre: ");
							String nombre5 = teclado.next();
							gestorResultado5.setUsuario(nombre5);
							break;
						case 'e':
							System.out.println("Email: ");
							String email5 = teclado.next();
							gestorResultado5.setCorreo(email5);
							break;
						case 'c':
							System.out.println("Contraseña: ");
							String password5 = teclado.next();
							gestorResultado5.setPassword(password5);
							break;
						case 'x':
							System.out.println("Hasta la próxima!\n");
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

			case 2: // Menu clientes
				System.out.println("-----------------------");
				System.out.println("Menú clientes: \n");
				System.out.println("1. Nuevo cliente.");
				System.out.println("2. Insertar multiples clientes (x10).");
				System.out.println("3. Consultar cliente.");
				System.out.println("4. Mostrar clientes.");
				System.out.println("5. Modificar cliente.");
				System.out.println("6. Eliminar cliente.");
				System.out.println("0. Salir.");
				System.out.println("-----------------------");
				opcionClientes = teclado.nextInt();

				switch (opcionClientes) {
				case 1: // Crear cliente
					System.out.println("Nombre: ");
					String nombreCliente = teclado.next();
					System.out.println("Contraseña: ");
					String passwordCliente = teclado.next();
					System.out.println("Correo: ");
					String correoCliente = teclado.next();
					System.out.println("Saldo: ");
					Integer saldoCliente = teclado.nextInt();
					Cliente nuevoCliente = new Cliente(siguienteIdCliente, nombreCliente, passwordCliente, correoCliente, siguienteIdGestor, saldoCliente);
					clientes.add(nuevoCliente);
					siguienteIdCliente++;
					siguienteIdGestor++;
					System.out.println("-----------------------");
					System.out.println("Nuevo cliente \nCreado correctamente!!!");
					System.out.println("-----------------------");
					System.out.println(nuevoCliente);
					break;
				case 2: // Insetar multiples clientes
					System.out.println("-----------------------");
					System.out.println("Creando 10 nuevos clientes");
					System.out.println("-----------------------");

					for (int i = 0; i < 10; i++) {
						String nombreClientes = Utiles.nombreAleatorio();
						String passwordClientes = Utiles.nombreAleatorio();
						String correoClientes = Utiles.correoAleatorio();
						double saldoClientes = Math.random() * 10000;
						Cliente cliente = new Cliente(siguienteIdCliente, nombreClientes, passwordClientes, correoClientes, siguienteIdGestor, saldoClientes);
						clientes.add(cliente);
						siguienteIdCliente++;
						siguienteIdGestor++;
					}
					break;
				case 3: // Obtener un único cliente
					System.out.println("ID cliente: ");
					int idCliente = teclado.nextInt();
					Cliente clienteResultado = null;

					for (int i = 0; i < clientes.size(); i++) {
						Cliente cliente = clientes.get(i);
						if (cliente.getId() == idCliente) {
							clienteResultado = cliente;
							break;
						}
					}
					if (clienteResultado != null) {
						System.out.println(clienteResultado);
					} else {
						System.out.println("No se ha podido encontrar el cliente. ID: " + idCliente + ".");
					}
					break;
				case 4: // Consultar todos los clientes
					System.out.println(clientes);
					break;
				case 5: // Modificar un cliente
					System.out.println("ID cliente: ");
					int idCliente5 = teclado.nextInt();
					Cliente clienteResultado5 = null;
					int posicionCliente5 = -1;

					for (int i = 0; i < clientes.size(); i++) {
						Cliente cliente = clientes.get(i);
						if (cliente.getId() == idCliente5) {
							clienteResultado5 = cliente;
							posicionCliente5 = i;
							break;
						}
					}
					if (clienteResultado5 != null) {
						System.out.println("[n] Nombre: ");
						System.out.println("[e] Email: ");
						System.out.println("[c] Contraseña: ");
						System.out.println("[z] Saldo: ");
						System.out.println("[x] Cancelar: ");
						System.out.println("Campo a actualiar: ");
						char opcionActualizada5 = teclado.next().charAt(0);
						switch (opcionActualizada5) {
						case 'n':
							System.out.println("Nombre: ");
							String nombre5 = teclado.next();
							clienteResultado5.setUsuario(nombre5);
							break;
						case 'e':
							System.out.println("Email: ");
							String correo5 = teclado.next();
							clienteResultado5.setCorreo(correo5);
							break;
						case 'c':
							System.out.println("Contraseña: ");
							String password5 = teclado.next();
							clienteResultado5.setPassword(password5);
							break;
						case 'z':
							System.out.println("Saldo: ");
							Double saldo5 = teclado.nextDouble();
							clienteResultado5.setSaldo(saldo5);
							break;
						case 'x':
							System.out.println("Hasta la próxima!\n");
							break;
						default:
							System.out.println("Opción no válida");
						}
						System.out.println("Cliente actualizado. ID: " + idCliente5);
					} else {
						System.out.println("No se ha podido encontrar el cliente. ID: " + idCliente5 + ".");
					}
					break;
				case 6: // Eliminar un cliente
					System.out.println("ID cliente: ");
					int idCliente6 = teclado.nextInt();
					Cliente clienteResultado6 = null;
					int posicionCliente6 = -1;

					for (int i = 0; i < clientes.size(); i++) {
						Cliente cliente = clientes.get(i);
						if (cliente.getId() == idCliente6) {
							clienteResultado6 = cliente;
							posicionCliente6 = i;
							break;
						}
					}
					if (clienteResultado6 != null) {
						clientes.remove(posicionCliente6);
						System.out.println("Cliente eliminado. ID: " + idCliente6);
					} else {
						System.out.println("No se ha podido encontrar el cliente. ID: " + idCliente6 + ".");
					}
					break;
				case 0:
					System.out.println("Hasta la próxima!\n");
					break;
				default:
					System.out.println("Opción no válida");
				}
				break;
			case 3: // Menu Transferencias
				System.out.println("-----------------------");
				System.out.println("Menú transferencias: \n");
				System.out.println("1. Nueva transferencia.");
				System.out.println("2. Insertar multiples transferencias (x5).");
				System.out.println("3. Consultar transferencia.");
				System.out.println("4. Mostrar todas las transferencias.");
				System.out.println("0. Salir.");
				System.out.println("-----------------------");
				opcionTransferencias = teclado.nextInt();

				switch (opcionTransferencias) {
				case 1: // Crear transferencia
					System.out.println("Importe: ");
					double importeTransferencia = teclado.nextDouble();
					System.out.println("Concepto: ");
					String conceptoTransferencia = teclado.next();
					Transferencia nuevaTransferencia = new Transferencia(siguienteIdTransferencia, siguienteIdCliente, siguienteIdCliente, importeTransferencia, conceptoTransferencia);
					transferencias.add(nuevaTransferencia);
					siguienteIdTransferencia++;
					siguienteIdCliente++;
					siguienteIdGestor++;
					System.out.println("-----------------------");
					System.out.println("Nueva transferencia \nCompletada correctamente!!!");
					System.out.println("-----------------------");
					System.out.println(nuevaTransferencia);
					break;
				case 2: // Insetar multiples transferencias
					System.out.println("-----------------------");
					System.out.println("Creando 5 nuevas transferencias");
					System.out.println("-----------------------");

					Integer contadorConcepto = 1;
					Integer contadorImporte = 1;
					for (int i = 0; i < 5; i++) {
						conceptoTransferencia = "TEST" + contadorConcepto;						
						importeTransferencia = 1000.00 + contadorImporte;
						contadorConcepto++;
						contadorImporte++;
						Transferencia nuevaTransferencia2 = new Transferencia(siguienteIdTransferencia, siguienteIdCliente, siguienteIdCliente, importeTransferencia, conceptoTransferencia);
						transferencias.add(nuevaTransferencia2);
						siguienteIdTransferencia++;
						siguienteIdCliente++;
						siguienteIdGestor++;
					}
					break;
				case 3: // Obtener una única Transferencia
					System.out.println("ID Transferencia: ");
					int idTransferencia = teclado.nextInt();
					Transferencia transferenciaResultado = null;

					for (int i = 0; i < clientes.size(); i++) {
						Transferencia transferencia = transferencias.get(i);
						if (transferencia.getId() == idTransferencia) {
							transferenciaResultado = transferencia;
							break;
						}
					}
					if (transferenciaResultado != null) {
						System.out.println(transferenciaResultado);
					} else {
						System.out.println("No se ha podido encontrar la transferencia. ID: " + idTransferencia + ".");
					}
					break;
				case 4: // Consultar todos las transferencias
					System.out.println(transferencias);
					break;
				case 0:
					System.out.println("Hasta la próxima!\n");
					break;
				default:
					System.out.println("Opción no válida");
				}
				break;
//			case 0:
//				System.out.println("Hasta la próxima!\n");
//				break;
				
			case 4: // Menu Mensajes
				System.out.println("-----------------------");
				System.out.println("Menú mensajes: \n");
				System.out.println("1. Nuevo mensaje.");
				System.out.println("2. Insertar multiples mensajes (x5).");
				System.out.println("3. Consultar mensajes.");
				System.out.println("4. Mostrar todas los mensajes.");
				System.out.println("0. Salir.");
				System.out.println("-----------------------");
				opcionMensajes = teclado.nextInt();

				switch (opcionMensajes) {
				case 1: // Crear mensaje
					System.out.println("Texto: ");
					String textoMensaje = teclado.next();
					System.out.println("Concepto: ");
					Integer idDestinatario = teclado.nextInt();
					Mensaje nuevoMensaje = new Mensaje(siguienteIdMensaje, siguienteIdCliente, idDestinatario, textoMensaje, null);
					mensajes.add(nuevoMensaje);
					siguienteIdMensaje++;
					siguienteIdCliente++;
					System.out.println("-----------------------");
					System.out.println("Nuevo mensaje \nEnviado correctamente!!!");
					System.out.println("-----------------------");
					System.out.println(nuevoMensaje);
					break;
				case 2: // Insetar multiples mensajes
					System.out.println("-----------------------");
					System.out.println("Creando 5 nuevas transferencias");
					System.out.println("-----------------------");

					Integer contadorMensaje = 1;
					for (int i = 0; i < 5; i++) {
						textoMensaje = "TEST-" + contadorMensaje;						
						contadorMensaje++;
						Mensaje nuevoMensaje2 = new Mensaje(siguienteIdMensaje, siguienteIdCliente, siguienteIdCliente, textoMensaje, null);
						mensajes.add(nuevoMensaje2);
						siguienteIdMensaje++;
						siguienteIdCliente++;

					}
					break;
				case 3: // Obtener una única Transferencia
					System.out.println("ID Mensaje: ");
					int idMensaje = teclado.nextInt();
					Mensaje mensajeResultado = null;

					for (int i = 0; i < mensajes.size(); i++) {
						Mensaje mensaje = mensajes.get(i);
						if (mensaje.getId() == idMensaje) {
							mensajeResultado = mensaje;
							break;
						}
					}
					if (mensajeResultado != null) {
						System.out.println(mensajeResultado);
					} else {
						System.out.println("No se ha podido encontrar em mensaje. ID: " + idMensaje + ".");
					}
					break;
				case 4: // Consultar todos los mensajes
					System.out.println(mensajes);
					break;
				case 0:
					System.out.println("Hasta la próxima!\n");
					break;
				default:
					System.out.println("Opción no válida");
				}
				break;
			case 0:
				System.out.println("Hasta la próxima!\n");
				break;

			default:
				System.out.println("Opcion desconocida...\n");

			}
		} while (opcionMain != 0);
		teclado.close();
	}
	
//	private void login() {
//	System.out.print("ID Getor: ");
//	int idGetor = teclado.nextInt();
//	System.out.print("Contraseña: ");
//	String password = teclado.next();
//	Gestor gestor = buscarGetorPorId(idGestor);
//	
//	if (gestor!=null) {
//		if(gestor.getPassword().equals(password)) {
//			System.out.print("Login correcto!");
//		} else {
//			System.out.print("Login incorrecto!");
//		}
//	} else {
//		System.out.print("El usuario no existe...");
//	}
//}

}
