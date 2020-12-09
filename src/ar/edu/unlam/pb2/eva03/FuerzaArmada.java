package ar.edu.unlam.pb2.eva03;

import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas; 
	
	public FuerzaArmada(){
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}
	
	public void agregarVehiculo(Vehiculo veh){
		convoy.add(veh);
	}
	
	public Integer getCapacidadDeDefensa(){
		convoy.size();
	}
	
	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud){
		batallas.put(nombre, new Batalla(tipo, latitud, longitud));
	}
	
	public void getBatalla(){
		
	}

}
