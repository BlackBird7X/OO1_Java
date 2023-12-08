package Modelo;

import java.time.LocalDate;

public abstract class Servicio {
	protected String codServicio;
	protected double porcentajeDescuento;
	protected boolean enPromocion;
	
//Constructor	
	public Servicio(String codServicio, double porcentajeDescuento, boolean enPromocion) {
		super();
		this.codServicio = codServicio;
		this.porcentajeDescuento = porcentajeDescuento;
		this.enPromocion = enPromocion;
	}

	
	//Get y Set	
	public String getCodServicio() {
		return codServicio;
	}

	public void setCodServicio(String codServicio) {
		this.codServicio = codServicio;
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
	public String toString() {
		return "Servicio: [codServicio= " + codServicio + ", porcentajeDescuento= " + porcentajeDescuento
				+ ", enPromocion= " + enPromocion + "]";
	}
	
	public abstract double calcularPrecioFinal(LocalDate dia);
	
}
