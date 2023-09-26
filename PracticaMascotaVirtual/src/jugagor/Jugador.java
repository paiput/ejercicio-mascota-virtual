package jugagor;

import java.util.ArrayList;

import comidas.Comidas;
import mascotas.Mascota;
import objetos.Objeto;
import utiles.Escaner;
import utiles.Utiles;

public class Jugador {
	private String nombre;
	public Mascota mascota;
	private int dinero;
	private ArrayList<Comidas> comidas;
	private Objeto[] objetos;
	
	public Jugador(String nombre, int dinero) {
		this.nombre = nombre;
		this.dinero = dinero;
	}
	
	public void jugar() {
		int opc = 0;
	}
	
	public void comer() {
		System.out.println("--- INVENTARIO DE COMIDA ---");
		for (Comidas c : comidas) {
			System.out.println(" * " + c.getNombre() + ": " + c.getCantidad());
		}
	}
	
	public void tienda() {
		int opc = 0;
		do {
			System.out.print("¿Qué desea hacer? (1=comprar) (2=vender) (0=salir): ");
			switch(opc) {
			case 1:
				System.out.println("-- Menú de compra --");
				for (Comidas c : comidas) {
					System.out.println(" 1. " + c.getNombre() + ": $" + c.getPrecioCompra());
				}
				break;
			case 2:
				System.out.println("-- Menú de venta --");
				break;
			}
			opc = Utiles.ingresarEntero(Escaner.s, 0, 2);
		} while (opc != 0);
	}
	
	public void inventario() {}
	
	public void dormir() {}
}
