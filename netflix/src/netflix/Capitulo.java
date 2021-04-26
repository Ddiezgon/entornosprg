package netflix;

import java.util.ArrayList;

public class Capitulo {
	
	protected int duracion;
	public final int DURACION = 45;
	protected int num;
	protected ArrayList<Personaje> personajes;
	protected Temporada temporada;
	
	public Capitulo() {
		this.personajes = new ArrayList<Personaje>();
	}
	
	public Capitulo(int num, Temporada temporada) {
		this.num = num;
		this.temporada = temporada;
	}
	public Capitulo(int duracion, int num) {
		this.duracion = duracion;
		this.num = num;
		this.personajes = new ArrayList<Personaje>();
	}
	public int getDuracion() { return duracion; }
	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}
	
	public String listaPersonajes() {
		StringBuffer listadoPers = new StringBuffer();
		for(Personaje pers: personajes) {
			listadoPers.append(pers);
		}
		return listadoPers.toString();
	}
	
	@Override
	public String toString() {
		return "capitulo";
	}
	
	public int getNum() { return num; }
}
