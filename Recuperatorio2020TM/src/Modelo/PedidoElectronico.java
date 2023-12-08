package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class PedidoElectronico extends Pedido {
	private String motivo;
	private double porcentajeExtra;
	
	public PedidoElectronico(int idPedido, LocalDate fechaCreacion, double montoBase, String motivo,
			double porcentajeExtra) {
		super(idPedido, fechaCreacion, montoBase);
		this.motivo = motivo;
		this.porcentajeExtra = porcentajeExtra;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public double getPorcentajeExtra() {
		return porcentajeExtra;
	}

	public void setPorcentajeExtra(double porcentajeExtra) {
		this.porcentajeExtra = porcentajeExtra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(motivo, porcentajeExtra);
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
		PedidoElectronico other = (PedidoElectronico) obj;
		return Objects.equals(motivo, other.motivo)
				&& Double.doubleToLongBits(porcentajeExtra) == Double.doubleToLongBits(other.porcentajeExtra);
	}

	@Override
	public String toString() {
		return "PedidoElectronico: [motivo=" + motivo + ", porcentajeExtra=" + porcentajeExtra + "]";
	}

//-------------- CASOS DE USO --------------	
	public double calcularPrecioFinal() {
		double valorFinal=0;
		
		valorFinal = montoBase * (porcentajeExtra / 100);
		
		return valorFinal;
	}

	
}
