package Modelo;

import java.util.Objects;

public class Pelicula extends Audiovisual{
	private int duracion;

	public Pelicula(String codAudiovisual, String titulo, int anio, boolean estreno, String genero, int duracion) {
		super(codAudiovisual, titulo, anio, estreno, genero);
		this.duracion = duracion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(duracion);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return duracion == other.duracion;
	}

	@Override
	public String toString() {
		return "Pelicula: [duracion=" + duracion + "]";
	}

// CU: 6	
	public int calcularDuracion() {
		return duracion;
	}
	
	
}
