package banco;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		CuentaBancaria cuenta1 = new CuentaBancaria(123, 55.23);
		CuentaBancaria cuenta2 = new CuentaBancaria(456, 234.11);
		CuentaBancaria cuenta3 = new CuentaBancaria(789, 14);
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
		
		cuenta1.ingresarDinero(200);
		
		System.out.println(cuenta1 +  " [Actualizada]");

	}

}
