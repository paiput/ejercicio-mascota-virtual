package mascotas;

import estados.Estado;

public class Mascota {
	private String nombre;
	private Tipos tipo;
	private int energia, felicidad, hambre, suciedad;
	
	public Mascota(String nombre, Tipos tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		final int valorDefault = 50;
		energia = valorDefault;
		felicidad = valorDefault;
		hambre = valorDefault;
		suciedad = valorDefault;
	}
	
	public void dormir() {
		felicidad = corregirValor(felicidad + 20);
		suciedad = corregirValor(suciedad + 10);
		hambre = corregirValor(hambre + 20);
	}
	
	public void estadisticas() {
		System.out.println("Estadisticas de " + nombre);
		System.out.println("Energia: " + energia);
		System.out.println("Felicidad: " + felicidad);
		System.out.println("Hambre: " + hambre);
		System.out.println("Suciedad: " + suciedad);
	}
	
	public void bañar() {
		switch (tipo) {
		case AGUA:
			suciedad = 0;
		case FUEGO:
			suciedad = corregirValor(suciedad - 50);
		case TIERRA:
			suciedad = corregirValor(suciedad - 25);
		}
	}
	
	public int corregirValor(int v) {
		if (v < 0) return 0;
		if (v > 100) return 100;
		return v;
	}
}
