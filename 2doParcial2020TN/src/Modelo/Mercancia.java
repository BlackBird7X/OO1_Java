package Modelo;

import java.util.Objects;

public class Mercancia {
	protected String codMercancia;

	public Mercancia(String codMercancia) {
		super();
		this.codMercancia = codMercancia;
	}

	public String getCodMercancia() {
		return codMercancia;
	}

	public void setCodMercancia(String codMercancia) {
		this.codMercancia = codMercancia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codMercancia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mercancia other = (Mercancia) obj;
		return Objects.equals(codMercancia, other.codMercancia);
	}

	@Override
	public String toString() {
		return "Mercancia [codMercancia=" + codMercancia + "]";
	}
		
	
}
