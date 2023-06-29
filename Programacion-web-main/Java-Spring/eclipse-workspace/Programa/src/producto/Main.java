package producto;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Producto producto1 = new Producto("Zapatilla", 55.99, 15);
		Producto producto2 = new Producto("Camiseta", 20.99, 20);
		Producto producto3 = new Producto("Gorra", 30.99, 30);
		
		System.out.println(producto1);
		System.out.println(producto2);
		System.out.println(producto3);
		
		producto1.calcularTotal(20);
		producto2.calcularTotal(10);
		producto3.calcularTotal(50);
		
		
	}

}
