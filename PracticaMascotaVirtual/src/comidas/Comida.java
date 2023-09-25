package comidas;

public class Comida {
	private int ID, precioCompra, precioVenta, cantidad;
	private String nombre;
	private int hambre, energia, felicidad, suciedad;
	
	public Comida(int ID, String nombre, int precioCompra, int precioVenta, int hambre, int energia, int felicidad, int suciedad) {
		this.ID = ID;
		this.nombre = nombre;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.hambre = hambre;
		this.energia = energia;
		this.felicidad = felicidad;
		this.suciedad = suciedad;
	}
}
