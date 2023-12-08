package Modelo;

import java.util.Objects;

public abstract class Persona {
	protected int id;
	protected String apellido;
	protected String nombre;
	protected int dni;
	
//Constructor	
	public Persona(int id, String apellido, String nombre, int dni) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
	}

//Get y Set	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona: [id= " + id + ", apellido= " + apellido + ", nombre= " + nombre + ", dni= " + dni + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, id, nombre);
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
		return Objects.equals(apellido, other.apellido) && dni == other.dni && id == other.id
				&& Objects.equals(nombre, other.nombre);
	}
}
