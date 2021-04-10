import java.util.List;

public class Mision {

	private Planeta planeta;
	
	private List<Vehiculo> vehiculos;

	public Planeta getPlaneta() {
		return planeta;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public Mision(Planeta planeta, List<Vehiculo> vehiculos) {
		super();
		this.planeta = planeta;
		this.vehiculos = vehiculos;
	}
}
