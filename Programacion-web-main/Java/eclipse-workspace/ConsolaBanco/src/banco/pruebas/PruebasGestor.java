package banco.pruebas;

import app_banco.modelos.Gestor;

public class PruebasGestor {

	public PruebasGestor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		System.out.println("----Gestores-----\n");

		Gestor gestor = new Gestor(1, "Paco", "1234", "paco@correo.com");
		Gestor gestorB = new Gestor(2, "Ana", "4321", "ana@correo.com");
		Gestor gestorC = new Gestor();

		gestorC.setId(3);
		gestorC.setUsuario("Maria");
		gestorC.setPassword("5678");
		gestorC.setCorreo("maria@correo.com");

		System.out.println(gestor + "\n");
		System.out.println(gestorB + "\n");
		System.out.println(gestorC + "\n");

		if (gestor.equals(gestorB)) {
			System.out.println("Son el mismo gestor");
		} else {
			System.out.println("Son gestores distintos");
		}

	}

}
