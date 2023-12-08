package Modelo;

import java.time.LocalDate;

public class Gastronomia extends Servicio {
	private String gastromia;
	private double precio;
	private int diaSemDesc;
	
//Constructor	
	public Gastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion, String gastromia, double precio,
			int diaSemDesc) {
		super(codServicio, porcentajeDescuento, enPromocion);
		this.gastromia = gastromia;
		this.precio = precio;
		this.diaSemDesc = diaSemDesc;
	}

//Get y Set	
	public String getGastromia() {
		return gastromia;
	}

	public void setGastromia(String gastromia) {
		this.gastromia = gastromia;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDiaSemDesc() {
		return diaSemDesc;
	}

	public void setDiaSemDesc(int diaSemDesc) {
		this.diaSemDesc = diaSemDesc;
	}

	@Override
	public String toString() {
		return "Gastronomia: [gastromia= " + gastromia + ", precio= " + precio + ", diaSemDesc= " + diaSemDesc + "]";
	}

	@Override
	public double calcularPrecioFinal(LocalDate dia) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public double calcularPrecioFinal(LocalDate dia) {
//		//Si esta en promocion aplica el porcentajeDescuento
//		double precFinal=0;
//		
//		for(Servicio s : servicio) {
//			if(s.getFecha().getDay().equals(fecha.getDay())){
//				precFinal += s.calcularPrecioFinal();
//			}
//		}
//
//		return precFinal;
//	}
	
	
	
}
