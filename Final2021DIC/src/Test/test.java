package Test;

import Modelo.Sistema;
import Modelo.Serie;

public class test {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		
		//CU1
		System.out.println("1)");
		
		try {
			sistema.agregarAudiovisual("7389189", "TODOS TENEMOS UN MUERTO ...", 2021, true, "COMEDIA DRAMATICA", 103);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		//CU2
		System.out.println("");
		System.out.println("2)");
		try {
			sistema.agregarAudiovisual("1732485", "Los Simuladores", 2003, false, "DRAMA SOCIAL", true);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		//CU3
		System.out.println("");
		System.out.println("3)");
		
		try {
			sistema.agregarAudiovisual("3748916", "CORONADOS DE GLORIA", 2019, false, "DOCUMENTAL", false);
			sistema.agregarCapitulo("EL PRIMER TITULO", 2, 13, (Serie)sistema.traerAudiovisual("3748916"));
			sistema.agregarCapitulo("LA GENESIS DE LA GENERACION DORADA", 1, 14, (Serie)sistema.traerAudiovisual("3748916"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {	
			sistema.agregarAudiovisual("4689735", "LUNA DE AVELLANEDA", 2004, false, "COMEDIA DRAMATICA", 103);
			sistema.agregarAudiovisual("7389182", "TODOS TENEMOS UN MUERTO ...", 2021, true, "COMEDIA DRAMATICA", 103);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {	
			sistema.agregarAudiovisual("1732489", "Los Simuladores", 2003, false, "DRAMA SOCIAL", true);
			sistema.agregarCapitulo("Capitulo 2", 2, 35, (Serie)sistema.traerAudiovisual("1732489"));
			sistema.agregarCapitulo("Capitulo 1", 1, 40, (Serie)sistema.traerAudiovisual("1732489"));
			System.out.println(sistema.traerAudiovisual("3748916"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//CU4
		System.out.println("");
		System.out.println("4)");
		try {
			sistema.traerAudiovisual("4689735");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//CU5
		System.out.println("");
		System.out.println("5)");
		try {
			System.out.println(sistema.traerAudiovisual("4689735").calcularDuracion());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//CU6
		System.out.println("");
		System.out.println("6)");
		try {
			sistema.traerAudiovisual("3748916");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//CU7
		System.out.println("");
		System.out.println("7)");
		try {
			System.out.println(sistema.traerAudiovisual("3748916").calcularDuracion());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
