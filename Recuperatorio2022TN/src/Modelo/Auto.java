package Modelo;

import java.util.Objects;

public class Auto extends Vehiculo {
	private boolean tieneGNC;

	public Auto(int id, String marca, String modelo, String dominio, boolean tieneGNC) {
		super(id, marca, modelo, dominio);
		this.tieneGNC = tieneGNC;
	}

	public boolean isTieneGNC() {
		return tieneGNC;
	}

	public void setTieneGNC(boolean tieneGNC) {
		this.tieneGNC = tieneGNC;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tieneGNC);
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
		Auto other = (Auto) obj;
		return tieneGNC == other.tieneGNC;
	}

	@Override
	public String toString() {
		return "Auto: [tieneGNC=" + tieneGNC + "]";
	}
	
	
}
