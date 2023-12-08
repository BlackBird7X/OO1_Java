package Modelo;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

public class Sistema {
	private List<Persona> lstPersonas = new ArrayList<Persona>();
	private List<Seguridad> lstSeguridad = new ArrayList<Seguridad>();

//Constructor
	public Sistema() {
	super();
	}

//Get y Set	
	public List<Persona> getLstPersonas() {
		return lstPersonas;
	}

	public void setLstPersonas(List<Persona> lstPersonas) {
		this.lstPersonas = lstPersonas;
	}

	public List<Seguridad> getLstSeguridad() {
		return lstSeguridad;
	}

	public void setLstSeguridad(List<Seguridad> lstSeguridad) {
		this.lstSeguridad = lstSeguridad;
	}
	
	@Override
	public String toString() {
		return "Sistema: [lstPersonas= " + lstPersonas + ", lstSeguridad= " + lstSeguridad + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(lstPersonas, lstSeguridad);
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
		return Objects.equals(lstPersonas, other.lstPersonas) && Objects.equals(lstSeguridad, other.lstSeguridad);
	}
	
// -------------------- Casos de Uso --------------------
	
	// CU1:
	public boolean agregarEmpleado(String apellido, String nombre, int dni, int nroLegajo) {
	//No contempla excepcion
		boolean existe = false;
		int id=1;
		
		if(lstPersonas.size()>0) {
			id = lstPersonas.get(lstPersonas.size()-1).getId()+1;
		}
		lstPersonas.add(new Empleado(id, apellido, nombre, dni, nroLegajo));
		
		System.out.println("Se agrego Empleado");
		
		return existe;
	}
	
//CU2:	
	public boolean agregarVisita(String apellido, String nombre, int dni, String empresa) {
	//No contempla excepcion
		boolean existe = false;
		int id=1;
		
		if(lstPersonas.size()>0) {
			id = lstPersonas.get(lstPersonas.size()-1).getId()+1;
		}
		lstPersonas.add(new Visita(id, apellido, nombre, dni, empresa));
		
		System.out.println("Se agrego Visita");
		
		return existe;
	}
	
//CU3:	
	public Persona traerPersona(int id) {
		Persona aux = null;
		int i=0;
		
		while(i<lstPersonas.size() && aux==null) {
			if(lstPersonas.get(i).id == id) {
				aux = lstPersonas.get(i);
			}
			i++;
		}
		return aux;
	}
	
//CU4: 	
	public List<Seguridad> traerSeguridad(LocalDate fecha, Persona persona){
	//Trae todos los objetos Seguridad que ese dia haya fichado la persona
		 List<Seguridad> lstAux = new ArrayList<Seguridad>();
		 
		 for(Seguridad s : lstSeguridad) {
			 if(s.getPersona().equals(persona) && s.getFecha().isEqual(fecha)) {
				 lstAux.add(s);
			 }
		 }
		 return lstAux;
	}
	
//CU5: 	
	public boolean agregarSeguridad(LocalDate fecha, LocalTime hora, boolean entrada, Persona persona) throws Exception {
	//Una persona no puede registrar dos veces la salida o la entrada
		boolean existe = true;
		int id=1;
		int i=0;
		
		List<Seguridad> lstAux = traerSeguridad(fecha, persona);
		
		while(existe && i<lstAux.size()) {
			if(lstAux.get(lstAux.size()-1).isEntrada()==entrada) {
				throw new Exception ("No puede registrar dos veces la entrada o salida");
			}
			i++;
		}
		
		if(lstSeguridad.size()>0 && existe) {
			id = lstSeguridad.get(lstSeguridad.size()-1).getId()+1;
		}
		
		lstSeguridad.add(new Seguridad(id, fecha, hora, entrada, persona));
		
		System.out.println("Se agrego Seguridad");
		
		return existe;
	}

//CU6	
	public List<Seguridad> traerVisita(LocalDate fecha){
	//Debe traer todas las visitas de ese dia
		 List<Seguridad> lstAux = new ArrayList<Seguridad>();
		 
		 for(Seguridad s : lstSeguridad) {
			 if(s.getPersona() instanceof Visita && s.getFecha().isEqual(fecha)) {
				 lstAux.add(s);
			 }
		 }
		 return lstAux;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
