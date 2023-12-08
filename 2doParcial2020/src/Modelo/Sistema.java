package Modelo;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
//import java.time.LocalDate;

public class Sistema {
	private List<Servicio> lstServicio = new ArrayList<Servicio>();

//Constructor	
	public Sistema() {
		super();
	}

//Get y Set	
	public List<Servicio> getLstServicio() {
		return lstServicio;
	}

	public void setLstServicio(List<Servicio> lstServicio) {
		this.lstServicio = lstServicio;
	}

	@Override
	public String toString() {
		return "Sistema: [lstServicio= " + lstServicio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(lstServicio);
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
		return Objects.equals(lstServicio, other.lstServicio);
	}
	
// -------------------- Casos de Uso --------------------	
	//CU1:
	public Servicio traerServicio(String codServicio) {
		Servicio aux = null;
		int i=0;
		
		while(i<lstServicio.size() && aux==null) {
			if(lstServicio.get(i).getCodServicio().equals(codServicio)) {
				aux = lstServicio.get(i);
			}
			i++;
		}
		return aux;
	}
	
	//CU2:
	public Servicio traerServicio(boolean enPromocion) {
		Servicio aux = null;
		int i=0;
		
		while(i<lstServicio.size() && aux==null) {
			if(lstServicio.get(i).enPromocion==enPromocion) {
				aux = lstServicio.get(i);
			}
			i++;
		}
		return aux;
	}
	
	//CU3:
//	public Servicio traerServicio(boolean enPromocion, LocalDate dia) {
//		Servicio aux = null;
//		int i=0;	
//		
//		while(i<lstServicio.size() && aux==null) {
//			if(lstServicio.get(i).enPromocion==enPromocion && lstServicio.get(i).getDayOfMonth().equals(dia.getDayOfMonth())) {
//				aux = lstServicio.get(i);
//			}
//			i++;
//		}
//		return aux;
//	}
	
	//CU4:
	public boolean agregarGastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion, String
			gastronomia, double precio, int diaSemDesc) throws Exception {
		//Implementar excepcion si existe el objeto
		boolean existe = false;
		int i=0;
		
		while(existe && i<lstServicio.size()) {
			if(lstServicio.get(i).getCodServicio()==codServicio) {
				throw new Exception("Error: Ya existe.");
			}
			i++;
		}
		
		lstServicio.add(new Gastronomia(gastronomia, precio, existe, gastronomia, precio, i));
		
		return existe;
	}
}
