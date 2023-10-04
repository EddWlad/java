package com.cmc.repaso.entidades;

public class Item 
{
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public int getProductosDevueltos() {
		return productosDevueltos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public int getProductosVendidos() {
		return productosVendidos;
	}
	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
	public void imprimir()
	{
		System.out.println("Productos actuales: "+getProductosActuales());
		System.out.println("Productos devueltos: "+getProductosDevueltos());
		System.out.println("Productos vendidos: "+getProductosVendidos());
	}
	
	public void vender(int cantidadProductosVendidos)
	{
		this.productosActuales -= cantidadProductosVendidos;
		this.productosVendidos += cantidadProductosVendidos;
	}
	
	public void devolver(int catidadProductosVendidos)
	{
		this.productosActuales += catidadProductosVendidos;
		this.productosVendidos -= catidadProductosVendidos;
		this.productosDevueltos += catidadProductosVendidos;
	}
}
