
public class Rectangulo {

	// Atributo base y altura de tipo decimal
	// Consultar base y altura
	// Modificar base y altura

	private double base;
	private double altura;

	public Rectangulo() {
		this.base = 1;
		this.altura = 1;
	}

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double areaRectangulo(double base, double altura) {
		double areaRectangulo = base * altura;
		return areaRectangulo;
	}

	public double perimetroRectangulo(double base, double altura) {
		double perimetroRectangulo = ((base * 2) + (altura * 2));
		return perimetroRectangulo;
	}

	public void dibujarRectangulo() {
		for (int i = 1; i <= this.altura; i++) {
			for (int x = 0; x < this.base; x++) {
				System.out.print("▊ ");
			}
		System.out.println();
		}
	}

	// Convertir objetos de esta clase a si representación en texto
	// es un metodo que ya existe, lo sobreescribimos
	public String toString() {
		String textoRectangulo = "Base: " + this.base + " Altura: " + this.altura;
		return textoRectangulo;
	}
	
	public boolean equals(Object o) {
		// Convertir "o" a  tipo Rectangulo
		Rectangulo rectangulo = (Rectangulo) o;
		boolean mismaAltura = this.altura == rectangulo.altura;
		boolean mismaBase = this.base == rectangulo.base;
		return mismaAltura && mismaBase;
	}
}
