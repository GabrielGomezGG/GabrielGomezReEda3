package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Acuatico, Volador{

	private Double altura;
	private Double profundidad;
	
	public HidroAvion(Integer id, String modelo) {
		this.id = id;
		this.modelo = modelo;
		altura = 0.0;
		profundidad = 0.0;
	}
	
	
	public Double getAltura() {
		return altura;
	}

	public Double getProfundidad() {
		return profundidad;
	}

}
