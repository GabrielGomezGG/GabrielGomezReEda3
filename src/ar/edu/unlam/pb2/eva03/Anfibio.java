package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Acuatico, Terrestre{
	
	private Double velocidad;
	private Double profundidad;

	public Anfibio(Integer id, String modelo) {
		this.id = id;
		this.modelo = modelo;
		velocidad = 0.0;
		profundidad = 0.0;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public Double getProfundidad() {
		return profundidad;
	}
	
}
