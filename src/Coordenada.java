
public class Coordenada {
	
	private int x;

	private int y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Coordenada(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
		return other.x == this.x && other.y == this.y;
	} 
}
