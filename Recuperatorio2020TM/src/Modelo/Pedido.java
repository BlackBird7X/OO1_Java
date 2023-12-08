package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Pedido {
	protected int idPedido;
	protected LocalDate fechaCreacion;
	protected double montoBase;
	
	public Pedido(int idPedido, LocalDate fechaCreacion, double montoBase) {
		super();
		this.idPedido = idPedido;
		this.fechaCreacion = fechaCreacion;
		this.montoBase = montoBase;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public double getMontoBase() {
		return montoBase;
	}

	public void setMontoBase(double montoBase) {
		this.montoBase = montoBase;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaCreacion, idPedido, montoBase);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(fechaCreacion, other.fechaCreacion) && idPedido == other.idPedido
				&& Double.doubleToLongBits(montoBase) == Double.doubleToLongBits(other.montoBase);
	}

	@Override
	public String toString() {
		return "Pedido: [idPedido=" + idPedido + ", fechaCreacion=" + fechaCreacion + ", montoBase=" + montoBase + "]";
	}
	
//-------------- CASOS DE USO --------------
	public abstract double calcularPrecioFinal();
	
}
