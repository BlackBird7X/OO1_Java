package Modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Empleado extends Persona{
	private int sueldoBase;

	public Empleado(int idPersona, String nombre, String apellido, long dni, LocalDate fechaDeAlta, int sueldoBase) {
		super(idPersona, nombre, apellido, dni, fechaDeAlta);
		this.sueldoBase = sueldoBase;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(sueldoBase);
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
		return sueldoBase == other.sueldoBase;
	}

	@Override
	public String toString() {
		return super.toString() + " Empleado: [sueldoBase=" + sueldoBase + "]";
	}
	
	//CU: 7
	public int antiguedadEnAnios() {
		//fechaDeAlta contra el 1er dia habil del mes siguiente
		int aniosAnt;
		
		aniosAnt = Period.between(fechaDeAlta, LocalDate.of(2022, 12, 01)).getDays();
		
		return aniosAnt;
	}
	
	
	
	
}
