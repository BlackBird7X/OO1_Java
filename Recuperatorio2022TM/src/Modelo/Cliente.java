package Modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Cliente extends Persona{
	private boolean activo;

	public Cliente(int idPersona, String nombre, String apellido, long dni, LocalDate fechaDeAlta, boolean activo) {
		super(idPersona, nombre, apellido, dni, fechaDeAlta);
		this.activo = activo;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(activo);
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
		Cliente other = (Cliente) obj;
		return activo == other.activo;
	}

	@Override
	public String toString() {
		return super.toString() + " Cliente: [activo=" + activo + "]";
	}

	//CU: 7
	public int antiguedadEnAnios() {
		int aniosAnt;
		
		if(activo) {
			aniosAnt = Period.between(fechaDeAlta, LocalDate.of(2022, 11, 15)).getDays();
		} else {
			aniosAnt = 0;
		}
		return aniosAnt;
	}

	
	
	
	
}
