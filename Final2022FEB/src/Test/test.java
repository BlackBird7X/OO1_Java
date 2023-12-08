package Test;

import java.time.LocalDate;

import Modelo.Sistema;

public class test {

	public static void main(String[] args) {
		
		Sistema sistema = new Sistema();
		
		//CU1
		System.out.println("1)");
		try {
			sistema.agregarPropiedad(100, "direccion 1", false);
			sistema.agregarPropiedad(200, "direccion 2", true);
			sistema.agregarPropiedad(300, "direccion 3", 1, 4, true);
			sistema.agregarPropiedad(400, "direccion 4", 2, 1, true);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		//CU2
		System.out.println("2)");
		System.out.println(sistema.traerPropiedad(1));
		
		//CU3
		System.out.println("3)");
		try {
			sistema.alquilarPropiedad(null, LocalDate.of(2022, 03, 01), LocalDate.of(2022, 03, 05), 4);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			sistema.alquilarPropiedad(sistema.traerPropiedad(1), LocalDate.of(2022, 03, 05), LocalDate.of(2022, 03, 01), 4);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			sistema.alquilarPropiedad(sistema.traerPropiedad(1), LocalDate.of(2022, 03, 01), LocalDate.of(2022, 03, 05), 0);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		//CU4
		System.out.println("4)");
		try {
			System.out.println(sistema.alquilarPropiedad(sistema.traerPropiedad(1), LocalDate.of(2022, 03, 01), LocalDate.of(2022, 03, 05), 4));
			System.out.println(sistema.alquilarPropiedad(sistema.traerPropiedad(2), LocalDate.of(2022, 03, 03), LocalDate.of(2022, 03, 05), 2));
			System.out.println(sistema.alquilarPropiedad(sistema.traerPropiedad(3), LocalDate.of(2022, 03, 05), LocalDate.of(2022, 03, 9), 4));
			System.out.println(sistema.alquilarPropiedad(sistema.traerPropiedad(4), LocalDate.of(2022, 03, 07), LocalDate.of(2022, 03, 10), 2));	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}

}
