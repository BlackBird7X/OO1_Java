package Modelo;

import java.util.List;
import java.util.Objects;
import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
	private List<Propiedad> propiedades;
	private List<Alquiler> alquileres;
	
	public Sistema() {
		super();
		this.propiedades = new ArrayList<Propiedad>();
		this.alquileres = new ArrayList<Alquiler>();
	}

	public List<Propiedad> getPropiedades() {
		return propiedades;
	}

	public List<Alquiler> getAlquileres() {
		return alquileres;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alquileres, propiedades);
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
		return Objects.equals(alquileres, other.alquileres) && Objects.equals(propiedades, other.propiedades);
	}

	@Override
	public String toString() {
		return "Sistema: [propiedades=" + propiedades + ", alquileres=" + alquileres + "]";
	}

//CU: 1	agregarCasa
	public boolean agregarPropiedad(double precioBase, String direccion ,boolean tienePatio) {
	//El valor del id de propiedad se debe calcular
		int id=1;
		if(propiedades.size()>0) {
			id = propiedades.get(propiedades.size()-1).getId()+1;
		}
		return propiedades.add(new Casa(id, precioBase, direccion, tienePatio));
	}
	
//CU: 2	agregarDepa
	public boolean agregarPropiedad(double precioBase, String direccion ,int cantidadAmbientes, int nroPiso, boolean tieneAscensor) {
		//El valor del id de propiedad se debe calcular
		int id=1;
		if(propiedades.size()>0) {
			id = propiedades.get(propiedades.size()-1).getId()+1;
		}	
		return propiedades.add(new Departamento(id, precioBase, direccion, cantidadAmbientes, nroPiso, tieneAscensor));
	}
	
//CU: 3	
	public Propiedad traerPropiedad(int id) {
		Propiedad prAux = null;
		int i=0;
		
		while(i<propiedades.size() && prAux==null){
			if(id == propiedades.get(i).getId()) {
				prAux = propiedades.get(i);
			}
			i++;
		}
		
		return prAux;
	}
	
//CU: 7
	public boolean alquilarPropiedad(Propiedad propiedad, LocalDate fechaDesde, LocalDate fechaHasta, int cantidadNoches) throws Exception {
	//agrega un nuevo alquiler a la lista de alquileres
		System.out.println("Se alquilo la propiedad.");
		return alquileres.add(new Alquiler(propiedad, fechaDesde, fechaHasta, cantidadNoches));
	}
	
//CU: 8	
	public List<Alquiler> traerAlquileres(LocalDate desde, LocalDate hasta){
	//Trae todos los alquileres que tengan una fechaDesde = o post a "desde" y
	//una fechaHasta = o ant a "hasta"	
		List<Alquiler> lstAlqAux = new ArrayList<Alquiler>();
		
		for(Alquiler a : lstAlqAux) {
			if(a.getFechaDesde().isEqual(desde) || a.getFechaDesde().isAfter(desde) && a.getFechaHasta().isEqual(hasta) || a.getFechaHasta().isBefore(hasta)) {
				lstAlqAux.add(a);
			}
		}
		return lstAlqAux;
	}
	
//CU: 11
	public double calcularRecaudadoEntre(LocalDate desde, LocalDate hasta) {
	//Calcula precio final para alquileres en ese rango
		double recau=0;
		
		for(Alquiler a : alquileres) {
			if(a.getFechaDesde().isEqual(desde) && a.getFechaHasta().isEqual(hasta)) {
				recau = a.precioFinal();
			}
		}	
		return recau;
	}
}
