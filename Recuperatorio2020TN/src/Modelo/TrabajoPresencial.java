package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class TrabajoPresencial extends Asistencia{
	private LocalTime horaDesde;
	private LocalTime horaHasta;
	
	public TrabajoPresencial(int idAsistencia, LocalDate fecha, String legajo, LocalTime horaDesde,
			LocalTime horaHasta) {
		super(idAsistencia, fecha, legajo);
		this.horaDesde = horaDesde;
		this.horaHasta = horaHasta;
	}

	public LocalTime getHoraDesde() {
		return horaDesde;
	}

	public void setHoraDesde(LocalTime horaDesde) {
		this.horaDesde = horaDesde;
	}

	public LocalTime getHoraHasta() {
		return horaHasta;
	}

	public void setHoraHasta(LocalTime horaHasta) {
		this.horaHasta = horaHasta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(horaDesde, horaHasta);
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
		TrabajoPresencial other = (TrabajoPresencial) obj;
		return Objects.equals(horaDesde, other.horaDesde) && Objects.equals(horaHasta, other.horaHasta);
	}

	@Override
	public String toString() {
		return "TrabajoPresencial: [horaDesde=" + horaDesde + ", horaHasta=" + horaHasta + "]";
	}

	
	public double calcularHorasTrabajadas() {
	//Diferencia entre horario de entrada y salida	
		double valorHorario=0;
		
		if(horaDesde.isBefore(horaHasta)) {
			valorHorario = ((horaHasta.getHour() - horaDesde.getHour() * 60 + horaHasta.getMinute() - horaDesde.getMinute()) / 60);
		}
		
		return valorHorario;
	}
	
	
	
	
	
	
	
}
