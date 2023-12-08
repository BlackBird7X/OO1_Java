package Modelo;

import java.util.Objects;

public class Casa extends Propiedad{
	private boolean tienePatio;

	public Casa(int id, double precioBase, String direccion, boolean tienePatio) {
		super(id, precioBase, direccion);
		this.tienePatio = tienePatio;
		System.out.println("Se agrego la casa");
	}

	public boolean isTienePatio() {
		return tienePatio;
	}

	public void setTienePatio(boolean tienePatio) {
		this.tienePatio = tienePatio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tienePatio);
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
		Casa other = (Casa) obj;
		return tienePatio == other.tienePatio;
	}

	@Override
	public String toString() {
		return super.toString() + " Casa: [tienePatio=" + tienePatio + "]";
	}

//CU: 9
	public double precioPorNoche() {
		double valor;
		
		if(tienePatio==true) {
			valor = precioBase * 0.1;
		} else {
			valor = precioBase; 
		}
		return valor;
	}
	
	
}
