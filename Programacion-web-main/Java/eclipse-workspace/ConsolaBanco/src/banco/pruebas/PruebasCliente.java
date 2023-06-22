package banco.pruebas;

import app_banco.modelos.Cliente;

public class PruebasCliente {

	public PruebasCliente() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		System.out.println("----Clientes-----\n");
		
		Cliente cliente = new Cliente(11, "Paquito", "1234", "paquito@correo.com", 1, 100);
		Cliente clienteB = new Cliente(22, "Anita", "4321", "anita@correo.com", 1, 200);
		Cliente clienteC = new Cliente();
		
		clienteC.setId(33);
		clienteC.setUsuario("Marieta");
		clienteC.setPassword("5678");
		clienteC.setCorreo("marieta@correo.com");
		clienteC.setGestorId(1);
		clienteC.setSaldo(300);
		
		System.out.println(cliente + "\n");
		System.out.println(clienteB + "\n");
		System.out.println(clienteC + "\n");

		if (cliente.equals(clienteB)) {
			System.out.println("Son el mismo cliente");
		} else {
			System.out.println("Son clientes distintos");
		}

	}

}
