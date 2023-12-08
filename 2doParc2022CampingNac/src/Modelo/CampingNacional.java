package Modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class CampingNacional {
	private List<Persona> lstPersonas;
	private List<Servicio> lstServicios;
	
//Constructor	
	public CampingNacional() {
		super();
		this.lstPersonas = new ArrayList <Persona>();
		this.lstServicios = new ArrayList <Servicio>();
	}

//Get y Set	
	public List<Persona> getLstPersonas() {
		return lstPersonas;
	}

	public void setLstPersonas(List<Persona> lstPersonas) {
		this.lstPersonas = lstPersonas;
	}

	public List<Servicio> getLstServicios() {
		return lstServicios;
	}

	public void setLstServicios(List<Servicio> lstServicios) {
		this.lstServicios = lstServicios;
	}
	
	@Override
	public String toString() {
		return "CampingNacional: [lstPersonas=" + lstPersonas + ", lstServicios=" + lstServicios + "]";
	}
	
	
//	------------------------ CASOS DE USO ------------------------
	
// CU: 1
	public Persona traerPersona(long dni) {
		Persona persAux = null;
		int i=0;
		
		while(i<lstPersonas.size() && persAux==null) {
			if(lstPersonas.get(i).getDni()==dni) {
				persAux = lstPersonas.get(i);
			}
			i++;
		}
		return persAux;
	}
	
	
// CU: 2
	public boolean agregarPersona(String apellido, String nombre, long dni) throws Exception {
		Persona perAgregarAux = traerPersona(dni);
		int id=1;
		
		if(perAgregarAux!=null) {
			throw new Exception("La persona con el DNI ingresado ya existe.");
		}
		
		if(lstPersonas.size()>0) {
			id = lstPersonas.get(lstPersonas.size()-1).getIdPersona()+1;
		}
		
		return lstPersonas.add(new Persona(id, apellido, nombre, dni));
	}
	
	
// CU: 4	
	public boolean agregarRecreo(String codIngreso, LocalDate fechaIngreso, boolean checkOut, Persona responsable, int cantPersonas, double precioPersona) throws Exception {
	//Excepcion: codIngreso invalido	
		int id=1;
		
		if(lstServicios.size()>0) {
			id = lstServicios.get(lstServicios.size()-1).getIdServicio()+1;
		}
		System.out.println("Se agrego el recreo.");
		return lstServicios.add(new Recreo(id, codIngreso, fechaIngreso, checkOut, responsable, cantPersonas, precioPersona));
	}
	
	
// CU: 5	
	public boolean agregarCampamento(String codIngreso, LocalDate fechaIngreso, boolean checkOut, Persona responsable, LocalDate fechaEgreso, int cantCarpas, double precioCarpa) throws Exception {
	//Excepcion: codIngreso invalido	
			int id=1;
			
			if(lstServicios.size()>0) {
				id = lstServicios.get(lstServicios.size()-1).getIdServicio()+1;
			}
			System.out.println("Se agrego el campamento.");
			return lstServicios.add(new Campamento(id, codIngreso, fechaIngreso, checkOut, responsable, fechaEgreso, cantCarpas, precioCarpa));
		}
		
	
//CU: 8	
	public List<Servicio> traerServiciosPorPrecioFinal(double mayorIgualA){
		List<Servicio> lstSAux = new ArrayList<Servicio>();
		
		for(Servicio s : lstServicios) {
			if(s.isCheckOut() == true && s.calcularPrecioFinal() >= mayorIgualA) {
				lstSAux.add(s);
			}
		}
		return lstSAux;
	}
	
//CU: 9 
	public List<Campamento> traerCampamentosPorDias(int mayorIgualA){
		List<Campamento> lstCAux = new ArrayList<Campamento>();
		
		for(Servicio s : lstServicios) {
			if(s instanceof Campamento && ((Campamento) s).cantidadDias() >= mayorIgualA){
				lstCAux.add((Campamento) s);
			}
		}		
		return lstCAux;
	}
	
}
