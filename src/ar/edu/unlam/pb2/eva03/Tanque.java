package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre{
	
	private Double velocidad;
	
	public Tanque(Integer id, String modelo){
		this.id = id;
		this.modelo = modelo;
		this.velocidad = 0.0;
	}
	
	public Double getVelocidad(){
		return velocidad;
	}
}
