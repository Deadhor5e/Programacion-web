package multiplicar;

public class Multiplicar {

	private int numero, resultado;

	public Multiplicar() {
	}

	public Multiplicar(int numero) {
		this.numero = numero;
		for (int i = 0; i <= 10; i++) {
		resultado = this.numero * i;
		System.out.println(numero +  " x " + i + " = " + this.resultado);
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public String toString() {
		String textoCuenta = "5 x " + this.numero + " = " + this.resultado;
		return textoCuenta;
	}

}