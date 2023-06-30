package banco;

//Numero de cuenta y saldo
//Contructor para inicializar los atributos
//Getters Setters
//Ingresar dinero (double dinero) y actualizar el saldo

public class CuentaBancaria {
	
	private int numeroCuenta;
	private double saldo;

	public CuentaBancaria() {}
	
	public CuentaBancaria(int numeroCuenta, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresarDinero(double dinero) {
		this.saldo += dinero;
	}
	
	public void retirarDinero(double dinero) {
		this.saldo -= dinero;
	}
	
	public String toString() {
		String textoCuenta = "Nº Cuenta: " + this.numeroCuenta + ", Saldo actual: " + this.saldo + ".";
		return textoCuenta;
	}

}