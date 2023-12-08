package Test;

import java.time.LocalDate;
import java.time.LocalTime;

import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.SistemaCallCenter;

public class test {

	public static void main(String[] args) {
		SistemaCallCenter sistemaCC = new SistemaCallCenter();
		
		System.out.println(" ----- CASOS DE USO 1) -----");
		try {
			System.out.println(sistemaCC.agregarEmpleado("Pedro", "Gomez", 33333333, LocalDate.of(2022, 02, 11), 10000));
			System.out.println(sistemaCC.agregarEmpleado("Pablo", "Lopez", 44444444, LocalDate.of(2022, 03, 15), 9000));
			System.out.println(sistemaCC.agregarCliente("Luis", "Perez", 11111111, LocalDate.of(2022, 01, 01), true));
			System.out.println(sistemaCC.agregarCliente("Lucas", "Pereyra", 22222222, LocalDate.of(2022, 02, 01), false));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(" ----- CASOS DE USO 2) -----");
		try {
			System.out.println(sistemaCC.agregarLlamada(LocalDate.of(2022, 11, 06), LocalTime.of(10, 10), (Cliente)sistemaCC.traerPersona(11111111), (Empleado)sistemaCC.traerPersona(33333333), 5));
			System.out.println(sistemaCC.agregarLlamada(LocalDate.of(2022, 11, 07), LocalTime.of(10, 10), (Cliente)sistemaCC.traerPersona(11111111), (Empleado)sistemaCC.traerPersona(33333333), 5));
			System.out.println(sistemaCC.agregarLlamada(LocalDate.of(2022, 11, 07), LocalTime.of(10, 15), (Cliente)sistemaCC.traerPersona(22222222), (Empleado)sistemaCC.traerPersona(33333333), 5));
			System.out.println(sistemaCC.agregarLlamada(LocalDate.of(2022, 11, 07), LocalTime.of(10, 20), (Cliente)sistemaCC.traerPersona(11111111), (Empleado)sistemaCC.traerPersona(44444444), 3));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(" ----- CASOS DE USO 3) -----");
		System.out.println(sistemaCC.traerClientes(true));		
		
		System.out.println(" ----- CASOS DE USO 4) -----");
		System.out.println(sistemaCC.traerPersonasAntiguedad(2));	
		
		System.out.println(" ----- CASOS DE USO 5) -----");
		System.out.println(sistemaCC.traerLlamadas(LocalDate.of(2022, 11, 17), LocalTime.of(10, 10), LocalTime.of(10, 18)));
		
		System.out.println(" ----- CASOS DE USO 6) -----");
		try {
			System.out.println(sistemaCC.agregarCliente("Marcos", "Rios", 22222222, LocalDate.of(2022, 02, 01), true));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(" ----- CASOS DE USO 7) -----");
		try {
			System.out.println(sistemaCC.agregarEmpleado("Miguel", "Martinez", 44444444, LocalDate.of(2022, 02, 11), 9500));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(" ----- CASOS DE USO 8) -----");
		try {
			System.out.println(sistemaCC.agregarLlamada(LocalDate.of(2022, 11, 07), LocalTime.of(10, 30), (Cliente)sistemaCC.traerPersona(11111111), (Empleado)sistemaCC.traerPersona(33333333), 7));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
