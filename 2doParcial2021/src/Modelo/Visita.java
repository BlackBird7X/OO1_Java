package Modelo;

import java.util.Objects;

public class Visita extends Persona{
	private String empresa;

//Constructor	
	public Visita(int id, String apellido, String nombre, int dni, String empresa) {
		super(id, apellido, nombre, dni);
		this.empresa = empresa;
	}

//Get y Set	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return super.toString() + "Visita: [empresa= " + empresa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empresa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Visita other = (Visita) obj;
		return Objects.equals(empresa, other.empresa);
	}
	
	
	
	
	
}
