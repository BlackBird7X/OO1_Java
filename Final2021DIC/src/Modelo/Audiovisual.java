package Modelo;

import java.util.Objects;

public abstract class Audiovisual {
	protected String codAudiovisual;
	protected String titulo;
	protected int anio;
	protected boolean estreno;
	protected String genero;
	
	public Audiovisual(String codAudiovisual, String titulo, int anio, boolean estreno, String genero) {
		super();
		this.codAudiovisual = codAudiovisual;
		this.titulo = titulo;
		this.anio = anio;
		this.estreno = estreno;
		this.genero = genero;
	}

	public String getCodAudiovisual() {
		return codAudiovisual;
	}

	public void setCodAudiovisual(String codAudiovisual) throws Exception {
		if(codigoVerificador(codAudiovisual)) {
			this.codAudiovisual = codAudiovisual;
		} else {
			throw new Exception("Codigo incorrecto.");
		}
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isEstreno() {
		return estreno;
	}

	public void setEstreno(boolean estreno) {
		this.estreno = estreno;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anio, codAudiovisual, estreno, genero, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Audiovisual other = (Audiovisual) obj;
		return anio == other.anio && Objects.equals(codAudiovisual, other.codAudiovisual) && estreno == other.estreno
				&& Objects.equals(genero, other.genero) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Audiovisual: [codAudiovisual=" + codAudiovisual + ", titulo=" + titulo + ", anio=" + anio + ", estreno="
				+ estreno + ", genero=" + genero + "]";
	}
	
// ---------- CASOS DE USO ----------
// CU: 1	
	public boolean codigoVerificador(String codAudiovisual) {
		boolean codCorrecto = false;
		int sumaImpares = 0;
		int sumaPares = 0;
		int digitVerifImpares;
		int sumaParesImpares;
		int variableAux = 0;
		int i;
		
		//a)
		for(i=0; i<codAudiovisual.length()-1; i++) {
			if(i%2==0) {
				sumaImpares += Character.getNumericValue(codAudiovisual.charAt(i));
			}	
		}
		
		digitVerifImpares = sumaImpares * 3;

		//b)		
		for(i=0; i<codAudiovisual.length()-1; i++) {
			if(i%2!=0) {
				sumaPares += Character.getNumericValue(codAudiovisual.charAt(i));
			}
			
		}
		
		sumaParesImpares = digitVerifImpares + sumaPares;

		//c)
		while(sumaParesImpares%10!=0) {
			variableAux++;
			sumaParesImpares++;
		}
		
		if(variableAux == Character.getNumericValue(codAudiovisual.charAt(codAudiovisual.length()-1))) {
			codCorrecto=true;
		}
		
		return codCorrecto;
	}
	
//CU 6:	
	public abstract int calcularDuracion();
	
	
	
	
	
	
	
	
}
