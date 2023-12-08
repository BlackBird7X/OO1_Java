package Modelo;

import java.util.Objects;

public class Servicio extends Mercancia{
	private String servicio;
	private double presupuesto;
	private double porcentajeDescuento;
	private boolean enPromocion;
	
	public Servicio(String codMercancia, String servicio, double presupuesto, double porcentajeDescuento,
			boolean enPromocion) {
		super(codMercancia);
		this.servicio = servicio;
		this.presupuesto = presupuesto;
		this.porcentajeDescuento = porcentajeDescuento;
		this.enPromocion = enPromocion;
	}
	
	public String getServicio() {
		return servicio;
	}
	
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	
	public double getPresupuesto() {
		return presupuesto;
	}
	
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}
	
	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	public boolean isEnPromocion() {
		return enPromocion;
	}
	
	public void setEnPromocion(boolean enPromocion) {
		this.enPromocion = enPromocion;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(enPromocion, porcentajeDescuento, presupuesto, servicio);
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
		Servicio other = (Servicio) obj;
		return enPromocion == other.enPromocion
				&& Double.doubleToLongBits(porcentajeDescuento) == Double.doubleToLongBits(other.porcentajeDescuento)
				&& Double.doubleToLongBits(presupuesto) == Double.doubleToLongBits(other.presupuesto)
				&& Objects.equals(servicio, other.servicio);
	}
	
	@Override
	public String toString() {
		return "Servicio: [servicio=" + servicio + ", presupuesto=" + presupuesto + ", porcentajeDescuento="
				+ porcentajeDescuento + ", enPromocion=" + enPromocion + "]";
	}
	
	
	
}
