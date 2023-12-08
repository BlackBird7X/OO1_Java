package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Alquiler {
	private Propiedad propiedad;
	private LocalDate fechaDesde;
	private LocalDate fechaHasta;
	private int cantidadNoches;
	
	public Alquiler(Propiedad propiedad, LocalDate fechaDesde, LocalDate fechaHasta, int cantidadNoches) throws Exception {
		super();
		setPropiedad(propiedad);
		this.fechaDesde = fechaDesde;
		setFechaHasta(fechaHasta);
		setCantidadNoches(cantidadNoches);
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

//CU: 4	
	public void setPropiedad(Propiedad propiedad) throws Exception {
		if(propiedad == null) {
			throw new Exception ("Error, no puede ser nula.");
		} else {
			this.propiedad = propiedad;
		}
	}

	public LocalDate getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(LocalDate fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public LocalDate getFechaHasta() {
		return fechaHasta;
	}

//CU: 5	
	public void setFechaHasta(LocalDate fechaHasta) throws Exception{
		if(fechaHasta.isBefore(fechaDesde)) {
			throw new Exception("Error, fechaHasta no puede ser anterior a fechaDesde.");
		} else {
			this.fechaHasta = fechaHasta;
		}
	}

	public int getCantidadNoches() {
		return cantidadNoches;
	}

//CU: 6	
	public void setCantidadNoches(int cantidadNoches) throws Exception{
		if(cantidadNoches <= 0) {
			throw new Exception ("Error, la cantidad de noches no puede ser menor o igual a 0.");
		} else {
			this.cantidadNoches = cantidadNoches;
		}		
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidadNoches, fechaDesde, fechaHasta, propiedad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return cantidadNoches == other.cantidadNoches && Objects.equals(fechaDesde, other.fechaDesde)
				&& Objects.equals(fechaHasta, other.fechaHasta) && Objects.equals(propiedad, other.propiedad);
	}

	@Override
	public String toString() {
		return "Alquiler: [propiedad=" + propiedad + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta
				+ ", cantidadNoches=" + cantidadNoches + "]";
	}
	
//CU: 10
	public double precioFinal() {
	//Calcula precioPorNoche * cantidadNoches	
		double precioF;
		
		precioF = propiedad.precioPorNoche() * cantidadNoches;	
		return precioF;
	}
	

}
