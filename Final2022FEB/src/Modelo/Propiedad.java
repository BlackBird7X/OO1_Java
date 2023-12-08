package Modelo;

import java.util.Objects;

public abstract class Propiedad {
	protected int id;
	protected double precioBase;
	protected String direccion;
	
	public Propiedad(int id, double precioBase, String direccion) {
		super();
		this.id = id;
		this.precioBase = precioBase;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, id, precioBase);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propiedad other = (Propiedad) obj;
		return Objects.equals(direccion, other.direccion) && id == other.id
				&& Double.doubleToLongBits(precioBase) == Double.doubleToLongBits(other.precioBase);
	}

	@Override
	public String toString() {
		return "Propiedad: [id=" + id + ", precioBase=" + precioBase + ", direccion=" + direccion + "]";
	}
	
//CU: 9
	public abstract double precioPorNoche();
	
}
