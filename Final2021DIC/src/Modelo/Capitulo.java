package Modelo;

import java.util.Objects;

public class Capitulo {
	private String capitulo;
	private int nroCapitulo;
	private int duracion;
	
	public Capitulo(String capitulo, int nroCapitulo, int duracion) {
		super();
		this.capitulo = capitulo;
		this.nroCapitulo = nroCapitulo;
		this.duracion = duracion;
	}
	public String getCapitulo() {
		return capitulo;
	}
	public void setCapitulo(String capitulo) {
		this.capitulo = capitulo;
	}
	public int getNroCapitulo() {
		return nroCapitulo;
	}
	public void setNroCapitulo(int nroCapitulo) {
		this.nroCapitulo = nroCapitulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(capitulo, duracion, nroCapitulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Capitulo other = (Capitulo) obj;
		return Objects.equals(capitulo, other.capitulo) && duracion == other.duracion
				&& nroCapitulo == other.nroCapitulo;
	}
	
	@Override
	public String toString() {
		return "Capitulo: [capitulo=" + capitulo + ", nroCapitulo=" + nroCapitulo + ", duracion=" + duracion + "]";
	}
	
	//CU: 4		
//	public boolean agregarCapitulo(String capitulo, int nroCapitulo, int duracion, Serie serie) {
//		boolean s;
//		Serie sAux = traerAudiovisual(codAudiovisual);
//							
//	}
	
	
}
