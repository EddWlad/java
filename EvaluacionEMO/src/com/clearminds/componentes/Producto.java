package com.clearminds.componentes;

public class Producto 
{
	private String nombre;
	private double precio;
	private String codigo;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void incrementarPrecio(int porcentaje)
	{
		double conversion;
		double precioActual;
		conversion = (double) porcentaje/100.0;
		precioActual = getPrecio();
		precio= (conversion*precioActual)+precioActual;
	}
	
	public void disminuirPrecio(double descuento)
	{
		double precioActual;
		precioActual = getPrecio();
		precio = precioActual-descuento;
	}

	public Producto(String codigo, String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	
	
	
}
