package Modelo;

import java.util.Objects;

public abstract class Vehiculo {
	protected int id;
	protected String marca;
	protected String modelo;
	protected String dominio;
	
	public Vehiculo(int id, String marca, String modelo, String dominio) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.dominio = dominio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dominio, id, marca, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(dominio, other.dominio) && id == other.id && Objects.equals(marca, other.marca)
				&& Objects.equals(modelo, other.modelo);
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", dominio=" + dominio + "]";
	}
	
	
}
