package Modelo;

import java.util.List;
import java.util.Objects;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Tarjeta {
	private int idTarjeta;
	private String codigo;
	private String codigoCliente;
	private List<Compra> compras;
	
	public Tarjeta(int idTarjeta, String codigo, String codigoCliente) {
		super();
		this.idTarjeta = idTarjeta;
		this.codigo = codigo;
		this.codigoCliente = codigoCliente;
		this.compras = new ArrayList<Compra>();
	}
	
	public int getIdTarjeta() {
		return idTarjeta;
	}
	
	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getCodigoCliente() {
		return codigoCliente;
	}
	
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public List<Compra> getCompras() {
		return compras;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, codigoCliente, compras, idTarjeta);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(codigoCliente, other.codigoCliente)
				&& Objects.equals(compras, other.compras) && idTarjeta == other.idTarjeta;
	}
	
	@Override
	public String toString() {
		return "Tarjeta: [idTarjeta=" + idTarjeta + ", codigo=" + codigo + ", codigoCliente=" + codigoCliente
				+ ", compras=" + compras + "]";
	}

//CU: 4
	public boolean agregarCompra(LocalDate fecha, LocalTime hora, double puntosPorLitro, double litrosComprados, double puntosExtra) {
		int id=1;
			
		id = compras.get(compras.size()-1).getIdCompra()+1;
			
		return compras.add(new Efectivo(id, fecha, hora, puntosPorLitro, litrosComprados, puntosExtra));
	}
		
//CU: 5
	public boolean agregarCompra(LocalDate fecha, LocalTime hora, double puntosPorLitro, double litrosComprados, String medio, double puntosDeRegalo) {
		int id=1;
				
		id = compras.get(compras.size()-1).getIdCompra()+1;
				
		return compras.add(new Electronica(id, fecha, hora, puntosPorLitro, litrosComprados, medio, puntosDeRegalo));
	}		
		
//CU: 7	
	public double calcularPuntaje() {
		double total=0;
		
		for(Compra c : compras) {
			total += c.calcularPuntajeFinal();
		}
		
		return total;
	}	
		
		
//CU: 8		
	public double calcularPuntaje(LocalDate fecha) {
		double total=0;
		
		for(Compra c : compras) {
			if(c.getFecha().isEqual(fecha)) {
				total += c.calcularPuntajeFinal();
			}
		}
		
		return total;
	}
		
//CU: 9		
	public double calcularPuntaje(int anio, int mes) {
		double total=0;
		
		for(Compra c : compras) {
			if(Character.getNumericValue(c.getFecha().getYear())==anio && c.getFecha().getMonthValue()==mes) {
				total += c.calcularPuntajeFinal(); 
			}
		}
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
