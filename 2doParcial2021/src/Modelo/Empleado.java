package Modelo;

import java.util.Objects;

public class Empleado extends Persona{
	private int legajo;
	
//Constructor	
	public Empleado(int id, String apellido, String nombre, int dni, int legajo) {
		super(id, apellido, nombre, dni);
		this.legajo = legajo;
	}

//Get y Set	
	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado: [legajo= " + legajo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(legajo);
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
		Empleado other = (Empleado) obj;
		return legajo == other.legajo;
	}
}
