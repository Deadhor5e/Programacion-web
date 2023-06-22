package banco.pruebas;

import app_banco.modelos.Transferencia;

public class PruebasTransferencia {

	public PruebasTransferencia() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		System.out.println("-----Transferencia-----\n");

		Transferencia transferencia = new Transferencia(1, 2, 3, 500, "Primer ingreso");
		Transferencia transferenciaB = new Transferencia(2, 2, 3, 400, "Segundo ingreso");
		Transferencia transferenciaC = new Transferencia();

		transferenciaC.setId(3);
		transferenciaC.setIdOrdenante(3);
		transferenciaC.setIdBenecifiario(4);
		transferenciaC.setImporte(100);
		transferenciaC.setConcepto("Tercer ingreso");
		
		System.out.println(transferencia + "\n");
		System.out.println(transferenciaB + "\n");
		System.out.println(transferenciaC + "\n");

	}

}
