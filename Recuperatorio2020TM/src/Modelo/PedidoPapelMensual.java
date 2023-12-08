package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class PedidoPapelMensual extends Pedido{
	private LocalDate fechaEntrega;
	private int cantidadResmas;
	
	public PedidoPapelMensual(int idPedido, LocalDate fechaCreacion, double montoBase, LocalDate fechaEntrega,
			int cantidadResmas) {
		super(idPedido, fechaCreacion, montoBase);
		this.fechaEntrega = fechaEntrega;
		this.cantidadResmas = cantidadResmas;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public int getCantidadResmas() {
		return cantidadResmas;
	}

	public void setCantidadResmas(int cantidadResmas) {
		this.cantidadResmas = cantidadResmas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cantidadResmas, fechaEntrega);
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
		PedidoPapelMensual other = (PedidoPapelMensual) obj;
		return cantidadResmas == other.cantidadResmas && Objects.equals(fechaEntrega, other.fechaEntrega);
	}

	@Override
	public String toString() {
		return "PedidoPapelMensual: [fechaEntrega=" + fechaEntrega + ", cantidadResmas=" + cantidadResmas + "]";
	}

	
//-------------- CASOS DE USO --------------	
	public double calcularPrecioFinal() {
	 	
		return montoBase * cantidadResmas;
	}	
	
}
