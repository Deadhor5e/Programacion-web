package banco;

import java.util.Scanner;

public class CajeroAutomatico {

	public CajeroAutomatico() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		CuentaBancaria cuenta = new CuentaBancaria();

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce Nº de cuenta: ");
		int numeroCuenta = teclado.nextInt();

		System.out.print("Saldo inicial: ");
		double saldo = teclado.nextDouble();

		cuenta.setNumeroCuenta(numeroCuenta);
		cuenta.setSaldo(saldo);

		System.out.print(cuenta);

		int opcion = -1;

		do {
			System.out.println("\n1. Ver saldo\n2. Hacer ingreso\n3. Retirar dinero\n0. Salir\n");
			System.out.print("Opcion: ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println(cuenta);
				break;
			case 2:
				System.out.print("Introduce monto a ingresar: ");
				saldo = teclado.nextInt();
				cuenta.ingresarDinero(saldo);
				break;
			case 3:
				System.out.print("Introduce monto a retirar: ");
				saldo = teclado.nextDouble();
				cuenta.retirarDinero(saldo);
				break;
			case 0:
				System.out.print("Hasta la próxima!");
				break;
			default:
				System.out.print("Opción desconocida...");
				break;
			}
		} while (opcion != 0);
		
		teclado.close();

	}

}