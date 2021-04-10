
public class Drone  extends Vehiculo {

	public Drone(String nombre, Coordenada ubicacion) {
		super(nombre, ubicacion);
		// TODO Auto-generated constructor stub
	}

	public void Moverse(Coordenada nuevaUbicacion) {
		if (!nuevaUbicacion.equals(this.getUbicacion())) {
			//Procesar movimientos...			
		}
	}

}