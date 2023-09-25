package juegos;

public class Juego {
	private float energiaGas, felicidadGas, hambreGas, suciedadGas; // Gas -> gastada/o
	private float felicidadGrd; // Grd -> generada/o
	
	public Juego(float energiaGas, float felicidadGas, float felicidadGrd, float hambreGas, float suciedadGas) {
		this.energiaGas = energiaGas;
		this.felicidadGas = felicidadGas;
		this.felicidadGrd = felicidadGrd;
		this.hambreGas = hambreGas;
		this.suciedadGas = suciedadGas;
	}
	
	public void jugar() {}
}
