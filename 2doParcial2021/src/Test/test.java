package Test;

import java.time.LocalDate;
import java.time.LocalTime;

import Modelo.Sistema;

public class test {

	public static void main(String[] args){
		
		Sistema sistema = new Sistema();
		
		System.out.println("--- CU 1 ---");
		System.out.println(sistema.agregarVisita("Martino", "Marcelo", 44444444, "Coop TIC"));
		System.out.println(sistema.agregarEmpleado("Lopez", "Martin", 33333333, 3829));
		System.out.println(sistema.agregarEmpleado("Rodriguez", "Lucia", 11111111, 3840));
		System.out.println(sistema.agregarVisita("Molina", "Rocio", 22222222, "UNLa"));
		System.out.println(sistema.agregarVisita("Martino", "Marcelo", 44444444, "Coop TIC"));

		System.out.println("--- CU 2 ---");
		System.out.println(sistema.traerPersona(1));
		
		System.out.println("--- CU 3 ---");
		try {
			sistema.agregarSeguridad(LocalDate.of(2021, 9, 06), LocalTime.of(7, 50), true, sistema.traerPersona(1));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			sistema.agregarSeguridad(LocalDate.of(2021, 9, 06), LocalTime.of(8, 00), true, sistema.traerPersona(2));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			sistema.agregarSeguridad(LocalDate.of(2021, 9, 06), LocalTime.of(18, 10), false, sistema.traerPersona(1));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			sistema.agregarSeguridad(LocalDate.of(2021, 9, 06), LocalTime.of(18, 20), false, sistema.traerPersona(2));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			sistema.agregarSeguridad(LocalDate.of(2021, 9, 07), LocalTime.of(9, 00), true, sistema.traerPersona(3));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			sistema.agregarSeguridad(LocalDate.of(2021, 9, 07), LocalTime.of(9, 10), true, sistema.traerPersona(4));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			sistema.agregarSeguridad(LocalDate.of(2021, 9, 07), LocalTime.of(18, 10), false, sistema.traerPersona(3));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			sistema.agregarSeguridad(LocalDate.of(2021, 9, 07), LocalTime.of(18, 20), false, sistema.traerPersona(4));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("--- CU 3 ---");
		System.out.println(sistema.traerSeguridad(LocalDate.of(2021, 9, 07), sistema.traerPersona(4)));
		
		System.out.println("--- CU 4---");
		try {
			sistema.agregarSeguridad(LocalDate.of(2021, 9, 07), LocalTime.of(18, 25), false, sistema.traerPersona(4));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("--- CU 5 ---");
		System.out.println(sistema.traerVisita(LocalDate.of(2021, 9, 07)));
		
	}

}
