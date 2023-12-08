package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Efectivo extends Compra{
	private double puntosExtra;

	public Efectivo(int idCompra, LocalDate fecha, LocalTime hora, double puntosPorLitro, double litrosComprados,
			double puntosExtra) {
		super(idCompra, fecha, hora, puntosPorLitro, litrosComprados);
		this.puntosExtra = puntosExtra;
	}

	public double getPuntosExtra() {
		return puntosExtra;
	}

	public void setPuntosExtra(double puntosExtra) {
		this.puntosExtra = puntosExtra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(puntosExtra);
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
		Efectivo other = (Efectivo) obj;
		return Double.doubleToLongBits(puntosExtra) == Double.doubleToLongBits(other.puntosExtra);
	}

	@Override
	public String toString() {
		return "Efectivo: [puntosExtra=" + puntosExtra + "]";
	}

	
//CU: 6	
	public double calcularPuntajeFinal() {
		
		return (puntosPorLitro + puntosExtra) * litrosComprados;
	}
	
	
	
}
