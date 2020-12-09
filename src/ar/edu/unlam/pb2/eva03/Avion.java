package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador {
	
	protected Double altura;
	
	public Avion(Integer id, String mod){
		this.id = id;
		modelo = mod;
		altura = 0.0;
	}
	
	public Double getAltura(){
		return altura;
	}
}
