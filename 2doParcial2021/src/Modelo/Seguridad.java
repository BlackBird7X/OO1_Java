package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Seguridad {
	private int id;
	private LocalDate fecha;
	private LocalTime hora;
	private boolean entrada;
	private Persona persona;
	
//Constructor
	public Seguridad(int id, LocalDate fecha, LocalTime hora, boolean entrada, Persona persona) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.entrada = entrada;
		this.persona = persona;
	}

//Get y Set	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public boolean isEntrada() {
		return entrada;
	}

	public void setEntrada(boolean entrada) {
		this.entrada = entrada;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "\nSeguridad: [id= " + id + ", fecha= " + fecha + ", hora= " + hora + ", entrada= " + entrada + ", persona= "
				+ persona + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(entrada, fecha, hora, id, persona);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seguridad other = (Seguridad) obj;
		return entrada == other.entrada && Objects.equals(fecha, other.fecha) && Objects.equals(hora, other.hora)
				&& id == other.id && Objects.equals(persona, other.persona);
	}
}
