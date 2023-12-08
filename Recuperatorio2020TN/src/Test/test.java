package Test;

import java.time.LocalDate;
import java.time.LocalTime;

import Modelo.Sistema;

public class test {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		
		System.out.println("CU: 1-1");
		try {
			sistema.agregarTrabajoPresencial(LocalDate.of(2020, 10, 15), "1578", LocalTime.of(9, 00), LocalTime.of(17, 00));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("CU: 1-2");
		try {
			sistema.agregarTeletrabajo(LocalDate.of(2020, 10, 15), "3782", "Pandemia", 5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("CU: 1-3");
		try {
			sistema.agregarTrabajoPresencial(LocalDate.of(2020, 10, 15), "1578", LocalTime.of(10, 00), LocalTime.of(18, 00));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			sistema.agregarTeletrabajo(LocalDate.of(2020, 10, 16), "3782", "Pandemia", 9);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("CU: 2-1");
		System.out.println("cantidad de horas trabajadas: " + sistema.traerAsistencia(1).calcularHorasTrabajadas());
		System.out.println("cantidad de horas trabajadas: " + sistema.traerAsistencia(2).calcularHorasTrabajadas());
		
		System.out.println("CU: 3");
		try {
			sistema.agregarTrabajoPresencial(LocalDate.of(2020, 10, 15), "2839", LocalTime.of(9, 00), LocalTime.of(17, 00));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			sistema.agregarTeletrabajo(LocalDate.of(2020, 10, 16), "3452", "Pandemia", 5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			sistema.agregarTeletrabajo(LocalDate.of(2020, 10, 16), "5243", "Pandemia", 7);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("CU: 4-1");
		System.out.println(sistema.traerAsistencia(LocalDate.of(2020, 10, 15)));
		
		System.out.println("CU: 4-2");	
		System.out.println(sistema.traerAsistenciaV(true));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
