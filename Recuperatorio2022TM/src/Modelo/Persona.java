package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Persona {
	protected int idPersona;
	protected String nombre;
	protected String apellido;
	protected long dni;
	protected LocalDate fechaDeAlta;
	
	public Persona(int idPersona, String nombre, String apellido, long dni, LocalDate fechaDeAlta) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaDeAlta = fechaDeAlta;
	}
	
	public int getIdPersona() {
		return idPersona;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public long getDni() {
		return dni;
	}
	
	public void setDni(long dni) {
		this.dni = dni;
	}
	
	public LocalDate getFechaDeAlta() {
		return fechaDeAlta;
	}
	
	public void setFechaDeAlta(LocalDate fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, fechaDeAlta, idPersona, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && dni == other.dni
				&& Objects.equals(fechaDeAlta, other.fechaDeAlta) && idPersona == other.idPersona
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Persona: [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", fechaDeAlta=" + fechaDeAlta + "]";
	}
	
	//CU: 7
	public abstract int antiguedadEnAnios();
	
	
	
	
}
