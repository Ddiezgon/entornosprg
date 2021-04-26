package netflix;

public class Personaje {
	
	private String nombre;
	
	public Personaje(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + "]\n";
	}
}
