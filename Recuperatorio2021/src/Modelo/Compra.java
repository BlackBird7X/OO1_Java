package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public abstract class Compra {
	protected int idCompra;
	protected LocalDate fecha;
	protected LocalTime hora;
	protected double puntosPorLitro;
	protected double litrosComprados;
	
	public Compra(int idCompra, LocalDate fecha, LocalTime hora, double puntosPorLitro, double litrosComprados) {
		super();
		this.idCompra = idCompra;
		this.fecha = fecha;
		this.hora = hora;
		this.puntosPorLitro = puntosPorLitro;
		this.litrosComprados = litrosComprados;
	}
	
	public int getIdCompra() {
		return idCompra;
	}
	
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public LocalTime getHora() {
		return hora;
	}
	
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	public double getPuntosPorLitro() {
		return puntosPorLitro;
	}
	
	public void setPuntosPorLitro(double puntosPorLitro) {
		this.puntosPorLitro = puntosPorLitro;
	}
	
	public double getLitrosComprados() {
		return litrosComprados;
	}
	
	public void setLitrosComprados(double litrosComprados) {
		this.litrosComprados = litrosComprados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, hora, idCompra, litrosComprados, puntosPorLitro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(hora, other.hora) && idCompra == other.idCompra
				&& Double.doubleToLongBits(litrosComprados) == Double.doubleToLongBits(other.litrosComprados)
				&& Double.doubleToLongBits(puntosPorLitro) == Double.doubleToLongBits(other.puntosPorLitro);
	}

	@Override
	public String toString() {
		return "Compra: [idCompra=" + idCompra + ", fecha=" + fecha + ", hora=" + hora + ", puntosPorLitro="
				+ puntosPorLitro + ", litrosComprados=" + litrosComprados + "]";
	}
	
	public abstract double calcularPuntajeFinal();
	
}
