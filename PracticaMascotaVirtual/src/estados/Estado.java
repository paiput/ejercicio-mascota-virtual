package estados;

public class Estado {
	private String nombre;
	public int valor;
	
	public Estado(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public String getNombre() {
		return nombre;
	}
}
