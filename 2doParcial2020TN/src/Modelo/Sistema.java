package Modelo;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Sistema {
	private List<Mercancia> lstMercancia;

	public Sistema() {
		super();
		this.lstMercancia = new ArrayList<Mercancia>();
	}

	public List<Mercancia> getLstMercancia() {
		return lstMercancia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lstMercancia);
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
		return Objects.equals(lstMercancia, other.lstMercancia);
	}

	@Override
	public String toString() {
		return "Sistema: [lstMercancia=" + lstMercancia + "]";
	}
	
//CU: 1	
	public Mercancia traerMercancia(String codMercancia) {
		Mercancia aux = null;
		int i=0;
		
		while(i<lstMercancia.size() && aux==null) {
			if(lstMercancia.get(i).getCodMercancia().equals(codMercancia)) {
				aux = lstMercancia.get(i);
			}
			i++;
		}
		return aux;
	}
	
//CU: 2	
//	public List<Mercancia> traerMercancia(boolean enOferta) {
//	//Retorna lista del tipo Mercancia
//	//Si es Servicio: Compara el parametro con si esta en promocion
//    //Si es Producto: Compara el parametro con si tiene descuento en 2da unidad
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
