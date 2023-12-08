package Test;

import java.time.LocalDate;
import Modelo.CampingNacional;

public class test {

	public static void main(String[] args) {
		CampingNacional campNac = new CampingNacional();
		
		System.out.println("--- CASO DE USO 1 ---");
		try {
			System.out.println(campNac.agregarPersona("Sergio", "Lopez", 11111111));
			System.out.println(campNac.agregarPersona("Juan", "Rodriguez", 22222222));
			System.out.println(campNac.agregarPersona("Maria", "Fernandez", 33333333));
			System.out.println(campNac.agregarPersona("Juan", "Vazquez", 44444444));
			System.out.println(campNac.agregarPersona("Ana", "Martinez", 55555555));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("--- CASO DE USO 2 ---");
		try {
			System.out.println(campNac.agregarRecreo("7358902", LocalDate.of(2022, 9, 02), false, campNac.traerPersona(11111111), 5, 300));
			System.out.println(campNac.agregarCampamento("6573540", LocalDate.of(2022, 9, 03), false, campNac.traerPersona(22222222), null, 1, 1500));
			System.out.println(campNac.agregarRecreo("3571398", LocalDate.of(2022, 9, 3), false, campNac.traerPersona(33333333), 10, 300));
			System.out.println(campNac.agregarCampamento("2583941", LocalDate.of(2022, 9, 3), false, campNac.traerPersona(44444444), LocalDate.of(2022, 9, 8), 2, 1500));
			System.out.println(campNac.agregarRecreo("5243925", LocalDate.of(2022, 9, 3), true, campNac.traerPersona(55555555), 8, 300));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("--- CASO DE USO 3 ---");
		System.out.println(campNac.traerServiciosPorPrecioFinal(500));
		
		System.out.println("--- CASO DE USO 4 ---");
		System.out.println(campNac.traerCampamentosPorDias(4));
		
		System.out.println("--- CASO DE USO 5 ---");
		try {
			campNac.agregarPersona("Vazquez", "Juan", 44444444);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("--- CASO DE USO 6 ---");
		try {
			campNac.agregarRecreo("3571394", LocalDate.of(2022, 9, 10), false, campNac.traerPersona(33333333), 5, 300);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
	}
}