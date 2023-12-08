package Modelo;

import java.time.LocalDate;

//import java.time.LocalDate;

public class Hospedaje extends Servicio{
	private String hospedaje;
	private double precioPorNoche;
	
//Constructor	
	public Hospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje,
			double precioPorNoche) {
		super(codServicio, porcentajeDescuento, enPromocion);
		this.hospedaje = hospedaje;
		this.precioPorNoche = precioPorNoche;
	}
	
//Get y Set	
	public String getHospedaje() {
		return hospedaje;
	}
	
	public void setHospedaje(String hospedaje) {
		this.hospedaje = hospedaje;
	}
	public double getPrecioPorNoche() {
		return precioPorNoche;
	}
	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	@Override
	public String toString() {
		return "Hospedaje: [hospedaje= " + hospedaje + ", precioPorNoche= " + precioPorNoche + "]";
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
//	}
	
	
	
}
