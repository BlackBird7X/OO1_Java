package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Serie extends Audiovisual {
	private boolean capitulosUnitarios;
	private List<Capitulo> lstCapitulos;
	
	public Serie(String codAudiovisual, String titulo, int anio, boolean estreno, String genero,
			boolean capitulosUnitarios) {
		super(codAudiovisual, titulo, anio, estreno, genero);
		this.capitulosUnitarios = capitulosUnitarios;
		this.lstCapitulos = new ArrayList<Capitulo>();
	}

	public boolean isCapitulosUnitarios() {
		return capitulosUnitarios;
	}

	public void setCapitulosUnitarios(boolean capitulosUnitarios) {
		this.capitulosUnitarios = capitulosUnitarios;
	}

	public List<Capitulo> getLstCapitulos() {
		return lstCapitulos;
	}

	public void setLstCapitulos(List<Capitulo> lstCapitulos) {
		this.lstCapitulos = lstCapitulos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capitulosUnitarios, lstCapitulos);
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
		Serie other = (Serie) obj;
		return capitulosUnitarios == other.capitulosUnitarios && Objects.equals(lstCapitulos, other.lstCapitulos);
	}

	@Override
	public String toString() {
		return "Serie: [capitulosUnitarios=" + capitulosUnitarios + ", lstCapitulos=" + lstCapitulos + "]";
	}
	
// CU: 4		
	public boolean agregarCapitulo(String capitulo, int nroCapitulo, int duracion, Serie serie) {
		Capitulo s = new Capitulo(capitulo, nroCapitulo, duracion);
		
		return lstCapitulos.add(s);			
	}
	
// CU: 6	
	public int calcularDuracion() {
		int sumatoria = 0;

		for(Capitulo c : lstCapitulos) {
			sumatoria += c.getDuracion();
		}
		return sumatoria;
	}	
}
