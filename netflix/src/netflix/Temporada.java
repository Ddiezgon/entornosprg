package netflix;

import java.util.ArrayList;

public class Temporada {
	
	private int numero;
	private ArrayList<Capitulo> capitulos;
	private Serie serie;
	
	public Temporada() {
		this.capitulos = new ArrayList<Capitulo>();
	}
	
	public Temporada(int numero, Serie serie) {
		this.numero = numero;
		this.serie = serie;
		this.capitulos = new ArrayList<Capitulo>();
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	public ArrayList<Capitulo> getCapitulo() { return capitulos; }
	public boolean addCapitulo(Capitulo capitulo) {
		if (!capitulos.contains(capitulo)) {
			capitulos.add(capitulo);
			//capitulo.setTemporada(this);
			return true;
		}
		else
			return false;
	}
	
	public String listaCapitulos() {
		/* Lo siguiente es una forma de novato
		String listado = "";
		for (Capitulo cap: capitulos) {
			listado += cap.toString();
		}
		return listado;
		*/
		StringBuffer listadoCap = new StringBuffer();
		String titulo = serie.getTitulo();
		for(Capitulo cap: capitulos) {
			listadoCap.append(titulo + "T" + numero + "C" + cap.getNum());
		}
		return listadoCap.toString();
	}

	public int getMinutosTemporada() {
		// TODO Auto-generated method stub
		return 0;
	}
}
