package Modelo;

import java.time.LocalDate;

public class Tarea {
	private int idTarea;
	private String tarea;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Empleado responsable;
	private int cantHorasDiarias;
	private boolean habil;
	
//Constructor	
	public Tarea(int idTarea, String tarea, LocalDate fechaInicio, LocalDate fechaFin, Empleado responsable,
			int cantHorasDiarias, boolean habil) {
		super();
		this.idTarea = idTarea;
		this.tarea = tarea;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.responsable = responsable;
		this.cantHorasDiarias = cantHorasDiarias;
		this.habil = habil; //true: labura lunes a viernes. false: labura sabado y domingo (No contempla feriados)
	}

//Get y Set	
	public int getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

	public String getTarea() {
		return tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Empleado getResponsable() {
		return responsable;
	}

	public void setResponsable(Empleado responsable) {
		this.responsable = responsable;
	}

	public int getCantHorasDiarias() {
		return cantHorasDiarias;
	}

	public void setCantHorasDiarias(int cantHorasDiarias) {
		this.cantHorasDiarias = cantHorasDiarias;
	}

	public boolean isHabil() {
		return habil;
	}

	public void setHabil(boolean habil) {
		this.habil = habil;
	}
	
	@Override
	public String toString() {
		return "Tarea: \n[idTarea= " + idTarea + ", tarea= " + tarea + ", fechaInicio= " + fechaInicio + ", fechaFin= "
				+ fechaFin + ", responsable= " + responsable + ", cantHorasDiarias= " + cantHorasDiarias + ", habil= "
				+ habil + "]";
	}
	
//-------------------- Metodos --------------------
	

//CASO DE USO 1:
	public double calcularJornal() {
	//Si trabaja fines de semana, cobra 50% más por cada hora de trabajo
	//habil true: jornal = cantHorasDiarias*valorHora
	//habil false: jornal = cantHorasDiarias*valorHora*1.5
		double jornal = 0;
		if(habil) {
			jornal=this.getCantHorasDiarias()*getResponsable().getValorHora();
		} else {
			jornal=this.getCantHorasDiarias()*getResponsable().getValorHora()*1.5;
		}
		return jornal;
	}
	
//CASO DE USO 2:	
	public int calcularCantDiasTrabajados(int mes, int anio) {
	//Retorna cant de dias trabajados para esa tarea en ese mes y año, dependiendo si el
	//responsable trabaja de lunes a viernes o fines de semana.
		int diasDelMes = Funciones.traerCantDiasDeUnMes(anio, mes);
		int diasTrabajados = 0;
		int i;
		LocalDate fecha;
		
		//Trabaja de Lunes a Viernes
		if(habil) {
			for(i=1; i<=diasDelMes; i++) {
				fecha = LocalDate.of(anio, mes, i);
				if(Funciones.esDiaHabil(fecha)) {
					diasTrabajados++;
				}
			}
		} else {
			for(i=1; i<=diasDelMes; i++) {
				fecha = LocalDate.of(anio, mes, i);
				if(!Funciones.esDiaHabil(fecha)) {
					diasTrabajados++;
				}
			}
		}
		return diasTrabajados;
	}
	
//CASO DE USO 3:
	public double calcularHonorarios(int mes, int anio) {
	//El producto entre cantDiasTrabajados(mes, anio) y el jornal (CU2 y CU3)
		double total = 0;
		total = calcularCantDiasTrabajados(mes, anio)*calcularJornal();
		return total;
	}
	
	
	
	
	
}
