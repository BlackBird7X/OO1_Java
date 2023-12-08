package Modelo;

import java.util.Objects;

public class Departamento extends Propiedad{
	private int cantidadAmbientes;
	private int nroPiso;
	private boolean tieneAscensor;
	
	public Departamento(int id, double precioBase, String direccion, int cantidadAmbientes, int nroPiso,
			boolean tieneAscensor) {
		super(id, precioBase, direccion);
		this.cantidadAmbientes = cantidadAmbientes;
		this.nroPiso = nroPiso;
		this.tieneAscensor = tieneAscensor;
		System.out.println("Se agrego el departamento");
	}

	public int getCantidadAmbientes() {
		return cantidadAmbientes;
	}

	public void setCantidadAmbientes(int cantidadAmbientes) {
		this.cantidadAmbientes = cantidadAmbientes;
	}

	public int getNroPiso() {
		return nroPiso;
	}

	public void setNroPiso(int nroPiso) {
		this.nroPiso = nroPiso;
	}

	public boolean isTieneAscensor() {
		return tieneAscensor;
	}

	public void setTieneAscensor(boolean tieneAscensor) {
		this.tieneAscensor = tieneAscensor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cantidadAmbientes, nroPiso, tieneAscensor);
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
		Departamento other = (Departamento) obj;
		return cantidadAmbientes == other.cantidadAmbientes && nroPiso == other.nroPiso
				&& tieneAscensor == other.tieneAscensor;
	}

	@Override
	public String toString() {
		return "Departamento: [cantidadAmbientes=" + cantidadAmbientes + ", nroPiso=" + nroPiso + ", tieneAscensor="
				+ tieneAscensor + "]";
	}

//CU: 9	
	public double precioPorNoche() {
		return precioBase + (cantidadAmbientes * 100);
	}
	
	
	
	
	
	
}
