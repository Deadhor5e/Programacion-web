package producto;

//Atributo Nombre, Precio y Cantidad Stock
//COntrsutctor para inicializar los atributos
//Getters Setters
//CalcularTotal(double descuento) y calcule el coste con descuento

public class Producto {

	private String nombre;
	private double precio;
	private int stock;

	public Producto() {
	}

	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String toString() {
		String textoProducto = "Producto: " + this.nombre + ", Precio: " + this.precio + ", Stock: " + this.stock + ".";
		return textoProducto;
	}

	public void calcularTotal(double descuento) {
		double costoConDescuento = precio - (precio * (descuento / 100));
		  System.out.println("Producto: " + nombre + ", Precio con descuento: " + costoConDescuento);
	}

}
