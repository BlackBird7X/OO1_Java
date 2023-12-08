package Modelo;

import java.util.List;
import java.util.Objects;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class SistemaCallCenter {
	private List<Llamada> lstLlamadas;
	private List<Persona> lstPersonas;
	
	public SistemaCallCenter() {
		super();
		this.lstLlamadas = new ArrayList<Llamada>();
		this.lstPersonas = new ArrayList<Persona>();
	}
	
	public List<Llamada> getLstLlamadas() {
		return lstLlamadas;
	}

	public List<Persona> getLstPersonas() {
		return lstPersonas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lstLlamadas, lstPersonas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SistemaCallCenter other = (SistemaCallCenter) obj;
		return Objects.equals(lstLlamadas, other.lstLlamadas) && Objects.equals(lstPersonas, other.lstPersonas);
	}

	@Override
	public String toString() {
		return "SistemaCallCenter: [lstLlamadas=" + lstLlamadas + ", lstPersonas=" + lstPersonas + "]";
	}
	
	//CU: 1
	public Persona traerPersona(long dni) {
		Persona pAux=null;
		int i=0;
		
		while(i<lstPersonas.size()&&pAux==null) {
			if(dni==lstPersonas.get(i).getDni()) {
				pAux = lstPersonas.get(i);
			}
			i++;
		}
		return pAux;
	}
	
	
	//CU: 2
	public boolean agregarCliente(String nombre, String apellido, long dni, LocalDate fechaDeAlta, boolean activo) throws Exception {
		int id=1;
		Persona pAux = traerPersona(dni);
		
		if(pAux!=null) {
			throw new Exception("Ya existe una persona con ese DNI.");
		}
		
		if(lstPersonas.size()>0) {
			id = lstPersonas.get(lstPersonas.size()-1).getIdPersona()+1;
		}	
		
		return lstPersonas.add(new Cliente(id, nombre, apellido, dni, fechaDeAlta, activo));
	}
	
	//CU: 3
		public boolean agregarEmpleado(String nombre, String apellido, long dni, LocalDate fechaDeAlta, int sueldoBase) throws Exception {
			int id=1;
			Persona pAux = traerPersona(dni);
			
			if(pAux!=null) {
				throw new Exception("Ya existe una persona con ese DNI.");
			}
			
			if(lstPersonas.size()>0) {
				id = lstPersonas.get(lstPersonas.size()-1).getIdPersona()+1;
			}
			
			return lstPersonas.add(new Empleado(id, nombre, apellido, dni, fechaDeAlta, sueldoBase));
		}
		
	//CU: 5
		public boolean agregarLlamada(LocalDate fecha, LocalTime hora, Cliente cliente, Empleado empleado, int nivelDeSatisfaccion) throws Exception {
			int id=1;
			
			if(lstLlamadas.size()>0) {
				id = lstLlamadas.get(lstLlamadas.size()-1).getIdLlamada()+1;
			}
			
			return lstLlamadas.add(new Llamada(id, fecha, hora, cliente, empleado, nivelDeSatisfaccion));
		}
	
	//CU: 6
	public List<Cliente> traerClientes(boolean estadoCliente) {
		List<Cliente> lstCAux = new ArrayList<Cliente>();
		
		for(Persona p : lstPersonas) {
			if(p instanceof Cliente && ((Cliente) p).isActivo()) {
				lstCAux.add((Cliente) p);
			}
		}
		return lstCAux;
	}
	
	//CU: 8
	public List<Persona> traerPersonasAntiguedad(int mayorIgualA) {
		List<Persona> lstPAux = new ArrayList<Persona>();
		
		for(Persona p : lstPersonas) {
			if(p instanceof Cliente || p instanceof Empleado && p.antiguedadEnAnios()>=mayorIgualA) {
				lstPAux.add(p);
			}
		}
		return lstPAux;
	}
	
	//CU: 9 
	public List<Llamada> traerLlamadas(LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta) {
		List<Llamada> lstLAux = new ArrayList<Llamada>();
		
		for(Llamada l : lstLlamadas) {
			if(l.getFecha().isEqual(fecha) && l.getHora().isAfter(horaDesde) || l.getHora().equals(horaDesde) && l.getHora().equals(horaHasta) || l.getHora().isBefore(horaHasta)) {
				lstLAux.add(l);
			}
		}
		return lstLAux;
	}
	
	
	
	
	
	
		
}
