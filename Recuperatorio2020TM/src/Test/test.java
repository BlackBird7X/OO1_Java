package Test;

import java.time.LocalDate;

import Modelo.Sistema;

public class test {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		
		System.out.println("CU 1-1)");
		try {
			sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 10, 10), 1000, LocalDate.of(2020, 10, 15), 4);
			System.out.println("CU 1-2)");
			sistema.agregarPedidoElectronico(LocalDate.of(2020, 10, 11), 3000, "rotura PC", 200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("CU 1-3)");
		try {
			sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 10, 11), 1000, LocalDate.of(2020, 10, 15), 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			sistema.agregarPedidoElectronico(LocalDate.of(2020, 10, 12), 3000, "", 200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("CU 2-1)");
		System.out.println(sistema.traerPedido(1).calcularPrecioFinal());
		System.out.println(sistema.traerPedido(2).calcularPrecioFinal());
		
		System.out.println("CU 3)");
		try {
			sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 10, 12), 1200, LocalDate.of(2020, 10, 16), 3);
			sistema.agregarPedidoElectronico(LocalDate.of(2020, 10, 14), 3000, "rotura PC", 200);
			sistema.agregarPedidoElectronico(LocalDate.of(2020, 10, 15), 3100, "rotura Monitor", 210);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("CU 4-1)");
		System.out.println(sistema.traerPedido("rotura PC"));
		
		System.out.println("CU 4-2)");
		System.out.println(sistema.calcularTotalGeneral());
		
		
		
		
	}
}
