package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Electronica extends Compra{
	private String medio;
	private double puntosDeRegalo;
	
	public Electronica(int idCompra, LocalDate fecha, LocalTime hora, double puntosPorLitro, double litrosComprados,
			String medio, double puntosDeRegalo) {
		super(idCompra, fecha, hora, puntosPorLitro, litrosComprados);
		this.medio = medio;
		this.puntosDeRegalo = puntosDeRegalo;
	}
	
	public String getMedio() {
		return medio;
	}
	
	public void setMedio(String medio) {
		this.medio = medio;
	}
	
	public double getPuntosDeRegalo() {
		return puntosDeRegalo;
	}
	
	public void setPuntosDeRegalo(double puntosDeRegalo) {
		this.puntosDeRegalo = puntosDeRegalo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(medio, puntosDeRegalo);
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
		Electronica other = (Electronica) obj;
		return Objects.equals(medio, other.medio)
				&& Double.doubleToLongBits(puntosDeRegalo) == Double.doubleToLongBits(other.puntosDeRegalo);
	}
	
	@Override
	public String toString() {
		return "Electronica: [medio=" + medio + ", puntosDeRegalo=" + puntosDeRegalo + "]";
	}
	
	
//CU: 6	
	public double calcularPuntajeFinal() {
			
		return (puntosPorLitro * litrosComprados) + puntosDeRegalo;
	}
	
}
