
public abstract class Vehiculo {

	private int id;
	
	private String nombre;
	
	private Coordenada ubicacion;

	private boolean activo = false;
	
	public Vehiculo(String nombre, Coordenada ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Coordenada getUbicacion() {
		return ubicacion;
	}

	public boolean isActivo() {
		return activo;
	}

}
