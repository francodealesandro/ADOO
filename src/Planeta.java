import java.util.List;

public class Planeta {
	
	private String nombre;
	
	private Coordenada tamanio;
	
	private List<Obtaculo> obstaculos;
	
	public Planeta(String nombre, Coordenada tamanio, List<Obtaculo> obstaculos) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.obstaculos = obstaculos;
	} 
	
}
