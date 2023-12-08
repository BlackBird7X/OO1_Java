package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sistema {
	private List<Audiovisual> lstAudiovisual;

	public Sistema() {
		super();
		this.lstAudiovisual = new ArrayList<Audiovisual>();
	}

	public List<Audiovisual> getLstAudiovisual() {
		return lstAudiovisual;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lstAudiovisual);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sistema other = (Sistema) obj;
		return Objects.equals(lstAudiovisual, other.lstAudiovisual);
	}

	@Override
	public String toString() {
		return "Sistema: [lstAudiovisual=" + lstAudiovisual + "]";
	}
	
// ---------- CASOS DE USO ----------
// CU: 2
	public boolean agregarAudiovisual(String codAudiovisual, String audiovisual, int anio, boolean estreno, String genero, int duracion) throws Exception {
		
		return lstAudiovisual.add(new Pelicula(codAudiovisual, audiovisual, anio, estreno, genero, duracion));
	}
	
// CU: 3	
	public boolean agregarAudiovisual(String codAudiovisual, String audiovisual, int anio, boolean estreno, String genero, boolean capitulosUnitarios) throws Exception {
		
		return lstAudiovisual.add(new Serie(codAudiovisual, audiovisual, anio, estreno, genero, capitulosUnitarios));
	}
	
//CU: 4		
	public boolean agregarCapitulo(String capitulo, int nroCapitulo, int duracion, Serie serie) {
		Serie s = (Serie) traerAudiovisual(serie.getCodAudiovisual());
		
		return s.agregarCapitulo(capitulo, nroCapitulo, duracion, serie);
	}
	
// CU: 5	
	public Audiovisual traerAudiovisual(String codAudiovisual) {
		Audiovisual audAux = null;
		int i=0;
	
		while(i<lstAudiovisual.size() && audAux==null) {
			if(codAudiovisual.equalsIgnoreCase(lstAudiovisual.get(i).getCodAudiovisual())) {
				audAux = lstAudiovisual.get(i);
			}
			i++;
		}
		return audAux;
	}
	
	
}
