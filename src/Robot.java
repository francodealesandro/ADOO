
public class Robot extends Vehiculo {

	private int movimientos = 20;
	
	public Robot(String nombre, Coordenada ubicacion, int movimientos) {
		super(nombre, ubicacion);
		this.movimientos = movimientos;
	}

	public void Moverse(String movimientos) {
		if (this.movimientos >= movimientos.length())
			this.movimientos -= movimientos.length();
		//Procesar movimientos...
	}

	public boolean PuedeMoverse() {
		return movimientos > 0;
	}

}
