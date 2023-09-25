package jugagor;

import comidas.Comida;
import mascotas.Mascota;
import objetos.Objeto;

public class Jugador {
	private String nombre;
	public Mascota mascota;
	private int dinero;
	private Comida[] comida;
	private Objeto[] objetos;
	
	public Jugador(String nombre, int dinero) {
		this.nombre = nombre;
		this.dinero = dinero;
	}
	
	public void jugar() {
		int opc = 0;
	}
	
	public void comer() {}
	
	public void tienda() {}
	
	public void bañar() {}
	
	public void inventario() {}
	
	public void estadisticas() {}
	
	public void dormir() {}
}
