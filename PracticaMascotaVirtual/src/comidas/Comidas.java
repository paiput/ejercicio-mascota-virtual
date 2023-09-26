package comidas;

public enum Comidas {
	PAPAS_FRITAS(201, "Papas Fritas", 5, 2, -5, -2, 1, 5),
	PIZZA(202, "Pizza", 10, 4, -10, -4, 4, 6),
	HAMBURGUESA(203, "Hamburguesa", 30, 10, -25, -5, 5, 7),
	TACO(204, "Tacos", 45, 20, -45, 2, 7, 8),
	SUSHI(205, "Sushi", 75, 30, -75, 4, 9, 1);
	
	private int ID, precioCompra, precioVenta, cantidad;
	private String nombre;
	private int hambre, energia, felicidad, suciedad;
	
	private Comidas(int ID, String nombre, int precioCompra, int precioVenta, int hambre, int energia, int felicidad, int suciedad) {
		this.ID = ID;
		this.nombre = nombre;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.hambre = hambre;
		this.energia = energia;
		this.felicidad = felicidad;
		this.suciedad = suciedad;
		cantidad = 0;
    }
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPrecioCompra() {
		return precioCompra;
	}
	
	public int getCantidad() {
		return cantidad;
	}
}
