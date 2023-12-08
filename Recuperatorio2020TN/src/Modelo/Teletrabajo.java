package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Teletrabajo extends Asistencia{
	private String motivo;
	private int tareasRealizadas;
	
	public Teletrabajo(int idAsistencia, LocalDate fecha, String legajo, String motivo, int tareasRealizadas) throws Exception {
		super(idAsistencia, fecha, legajo);
		this.motivo = motivo;
		setTareasRealizadas(tareasRealizadas);
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public int getTareasRealizadas() {
		return tareasRealizadas;
	}

	public void setTareasRealizadas(int tareasRealizadas) throws Exception {
		if(tareasRealizadas>8) {
			throw new Exception("No se pueden realizar mas de 8 tareas diarias.");
		}
		this.tareasRealizadas = tareasRealizadas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(motivo, tareasRealizadas);
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
		Teletrabajo other = (Teletrabajo) obj;
		return Objects.equals(motivo, other.motivo) && tareasRealizadas == other.tareasRealizadas;
	}

	@Override
	public String toString() {
		return "Teletrabajo: [motivo=" + motivo + ", tareasRealizadas=" + tareasRealizadas + "]";
	}

	
	public double calcularHorasTrabajadas() {
		double valorHorasTrabajadas=0;
		
		valorHorasTrabajadas += tareasRealizadas * 1.5;
		
		return valorHorasTrabajadas;
	}
	
	
	
	
	
}
