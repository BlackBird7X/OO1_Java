package Modelo;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class SistemaYPF {
	private List<Tarjeta> tarjetas;

	public SistemaYPF() {
		super();
		this.tarjetas = new ArrayList<Tarjeta>();
	}

	public List<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tarjetas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SistemaYPF other = (SistemaYPF) obj;
		return Objects.equals(tarjetas, other.tarjetas);
	}

	@Override
	public String toString() {
		return "SistemaYPF: [tarjetas=" + tarjetas + "]";
	}

//CU: 2	
	public Tarjeta traerTarjeta(String codigoCliente) {
		Tarjeta tAux = null;
		int i=0;
		
		while(i<tarjetas.size() && tAux==null) {
			if(tarjetas.get(i).getCodigoCliente().equalsIgnoreCase(codigoCliente)) {
				tAux = tarjetas.get(i);
			}
			i++;
		}
		
		return tAux;
	}
	
//CU: 3	
	public boolean agregarTarjeta(String codigo, String codigoCliente) throws Exception {
		int id=1;
		
		id = tarjetas.get(tarjetas.size()-1).getIdTarjeta()+1;
				
		return tarjetas.add(new Tarjeta(id, codigo, codigoCliente));
	}
	
}
