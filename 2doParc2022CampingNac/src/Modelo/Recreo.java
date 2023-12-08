package Modelo;

import java.time.LocalDate;

public class Recreo extends Servicio {
	private int cantPersonas;
	private double precioPersona;
	
//Constructor
	public Recreo(int idServicio, String codIngreso, LocalDate fechaIngreso, boolean checkOut, Persona responsable,
			int cantPersonas, double precioPersona) throws Exception {
		super(idServicio, codIngreso, fechaIngreso, checkOut, responsable);
		this.cantPersonas = cantPersonas;
		this.precioPersona = precioPersona;
	}

//Get y Set	
	public int getCantPersonas() {
		return cantPersonas;
	}

	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}

	public double getPrecioPersona() {
		return precioPersona;
	}

	public void setPrecioPersona(double precioPersona) {
		this.precioPersona = precioPersona;
	}

//	------------------------ CASOS DE USO ------------------------			
//CU: 7
	public double calcularPrecioFinal() {
		double precioF;
		
		precioF = precioPersona*cantPersonas;
		
		return precioF;
	}

	
}
