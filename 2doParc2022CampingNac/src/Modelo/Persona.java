package Modelo;

public class Persona {
	private int idPersona;
	private String apellido;
	private String nombre;
	private long dni;
	
//Constructor	
	public Persona(int idPersona, String apellido, String nombre, long dni) {
		super();
		this.idPersona = idPersona;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
	}

//Get y Set	
	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
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

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}
	
	
}
