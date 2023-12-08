package Modelo;

import java.util.Objects;

public class Producto extends Mercancia{
	private String producto;
	private double precioProducto;
	private double porcentajeDescuento;
	private boolean esDescuentoEn2daUnidad;
	
	public Producto(String codMercancia, String producto, double precioProducto, double porcentajeDescuento,
			boolean esDescuentoEn2daUnidad) {
		super(codMercancia);
		this.producto = producto;
		this.precioProducto = precioProducto;
		this.porcentajeDescuento = porcentajeDescuento;
		this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public boolean isEsDescuentoEn2daUnidad() {
		return esDescuentoEn2daUnidad;
	}

	public void setEsDescuentoEn2daUnidad(boolean esDescuentoEn2daUnidad) {
		this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(esDescuentoEn2daUnidad, porcentajeDescuento, precioProducto, producto);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return esDescuentoEn2daUnidad == other.esDescuentoEn2daUnidad
				&& Double.doubleToLongBits(porcentajeDescuento) == Double.doubleToLongBits(other.porcentajeDescuento)
				&& Double.doubleToLongBits(precioProducto) == Double.doubleToLongBits(other.precioProducto)
				&& Objects.equals(producto, other.producto);
	}

	@Override
	public String toString() {
		return "Producto: [producto=" + producto + ", precioProducto=" + precioProducto + ", porcentajeDescuento="
				+ porcentajeDescuento + ", esDescuentoEn2daUnidad=" + esDescuentoEn2daUnidad + "]";
	}
	
	
	
}
