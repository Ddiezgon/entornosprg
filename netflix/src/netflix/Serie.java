package netflix;

import java.util.ArrayList;

public class Serie {
	
	private String titulo;
	private ArrayList<Temporada> temporadas;
	/////////NO REFACTORING MINUTOS SERIE///////////
	
	public void duracionTotalSerie() {
		int duracion = 0;
		for(Temporada temporada: temporadas) {
				ArrayList<Capitulo> capitulos = temporada.getCapitulo();
				for(Capitulo capitulo: capitulos) {
					duracion += capitulo.getDuracion();
				}
		}
		System.out.println("La duración de la serie es " + duracion);
	}
	
	///////////CON REFACTORING//////////////////////
	
	public void duracionTotalSerieCON() {
		int duracion = 0;
		for(Temporada temporada: temporadas) {
			duracion += temporada.getMinutosTemporada();
		}
		System.out.println("La duración de la serie es " + duracion);
	}
	
	public Serie() {
		this.titulo = "";
		this.temporadas = new ArrayList<Temporada>();;
	}
	
	public Serie(String titulo, ArrayList<Temporada> temporadas) {
		this.titulo = titulo;
		this.temporadas = new ArrayList<Temporada>();
	}
	
	public boolean addTemporada(Temporada temporada) {
		temporadas.add(temporada);
		temporada.setSerie(this);
		return true;
	}
	
	public String getTitulo() { return titulo; }
}
