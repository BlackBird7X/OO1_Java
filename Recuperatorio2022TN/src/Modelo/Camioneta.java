package Modelo;

import java.util.Objects;

public class Camioneta extends Vehiculo {
	private float largo;
	private float ancho;
	private float alto;
	
	public Camioneta(int id, String marca, String modelo, String dominio, float largo, float ancho, float alto) {
		super(id, marca, modelo, dominio);
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(alto, ancho, largo);
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
		Camioneta other = (Camioneta) obj;
		return Float.floatToIntBits(alto) == Float.floatToIntBits(other.alto)
				&& Float.floatToIntBits(ancho) == Float.floatToIntBits(other.ancho)
				&& Float.floatToIntBits(largo) == Float.floatToIntBits(other.largo);
	}

	@Override
	public String toString() {
		return "Camioneta: [largo=" + largo + ", ancho=" + ancho + ", alto=" + alto + "]";
	}
	
	
}
