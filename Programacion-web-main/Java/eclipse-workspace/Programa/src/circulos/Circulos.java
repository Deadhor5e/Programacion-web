package circulos;

//Atributo radio
//Constructor para inicializar el radio
//Getters y Setters
//CalcularArea()

public class Circulos {
	
	private double radio;
	
	public Circulos() {}

	public Circulos(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double calcularArea() {
		double area = Math.PI * Math.pow(radio, 2);
		return area;
	}
	
	public String toString() {
		String textoCirculo = "Radio del circulo: " + this.radio + ".";
		return textoCirculo;
	}
}
