package mascotas;

import estados.Estado;

public class Mascota {
	private String nombre;
	private Tipos tipo;
	private float energia, felicidad, hambre, suciedad;
	
	public Mascota(String nombre, Tipos tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		final float valorDefault = 50f;
		energia = valorDefault;
		felicidad = valorDefault;
		hambre = valorDefault;
		suciedad = valorDefault;
	}
	
	public void dormir() {}
	
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
	
	public float corregirValor(float v) {
		if (v < 0) return 0f;
		if (v > 100) return 100f;
		return v;
	}
}
