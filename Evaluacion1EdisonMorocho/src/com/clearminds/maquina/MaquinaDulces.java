package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;


public class MaquinaDulces {
	private Celda celda1 = new Celda("");
	private Celda celda2 = new Celda("");
	private Celda celda3 = new Celda("");
	private Celda celda4 = new Celda("");
	private ArrayList<Celda> celdas;

	private double saldo = 0.0;

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}

	public void configurarMaquina(String celdaA, String celdaB, String celdaC, String celdaD) {
		celda1.setCodigo(celdaA);
		celda2.setCodigo(celdaB);
		celda3.setCodigo(celdaC);
		celda4.setCodigo(celdaD);
	}

	public void mostrarConfiguracion() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			System.out.println("Celda:" + elementoCelda.getCodigo());
		}
	}

	public void mostrarProductos() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) 
		{
			elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() == null) 
			{
				System.out.println("Celda:" + elementoCelda.getCodigo() + " Sin Producto asignado");
			} 
			else 
			{
				System.out.println("Celda:" + elementoCelda.getCodigo() + " Stock:" + elementoCelda.getStock()
						+ " Producto:" + elementoCelda.getProducto().getNombre() + " Precio:"
						+ elementoCelda.getProducto().getPrecio());
			}
		}
		System.out.println("Saldo: "+getSaldo());

	}

	public double consultarPrecio(String CodCelda) 
	{
		Celda celdaAdquirida;
		double precioEncontrado;
		celdaAdquirida = buscarCelda(CodCelda);
		if(celdaAdquirida != null)
		{
			precioEncontrado = celdaAdquirida.getProducto().getPrecio();
			return precioEncontrado;
		}
		else
		{
			precioEncontrado = 0.0;
			return precioEncontrado;
		}
	}

	public Producto buscarProductoEnCelda(String CodCelda) 
	{
		Celda celdaAdquirida;
		Producto productoEncontrado;
		celdaAdquirida = buscarCelda(CodCelda);
		if(celdaAdquirida != null)
		{
			productoEncontrado = celdaAdquirida.getProducto();
			return productoEncontrado;
		}
		else
		{
			return null;
		}
	}


	

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(Celda CodCelda) {
		celdas.add(CodCelda);
	}

	public Celda buscarCelda(String celdaCodigo) {
		Celda celdaEncontrada = null;
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (celdaCodigo.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;

			}

		}

		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidadItem) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, cantidadItem);
	}
	
	public Celda buscarCeldaProducto(String codigoProducto)
	{
		Celda celdaEncontrada = new Celda("");
		Celda elementoCelda;
		
		for (int i = 0; i < celdas.size(); i++)
		{
			elementoCelda = celdas.get(i);
			if(elementoCelda.getProducto() != null && codigoProducto.equals(elementoCelda.getProducto().getCodigo()))
			{
				celdaEncontrada = elementoCelda;
				break;
			}
			else
			{
				celdaEncontrada = null;
			}
		}
		return celdaEncontrada;
	}
	
	public void incrementarProductos(String CodProducto, int stock) 
	{
		int incrementoStock;
		Celda celdaEncontrada;
		celdaEncontrada = buscarCeldaProducto(CodProducto);
		incrementoStock = celdaEncontrada.getStock();
		celdaEncontrada.setStock(incrementoStock + stock);
	}

	public void vender(String CodCelda) 
	{
		int inventario;
		Celda celdaAdquirida;
		celdaAdquirida = buscarCelda(CodCelda);
		inventario = celdaAdquirida.getStock() - 1;
		celdaAdquirida.setStock(inventario);
		saldo += celdaAdquirida.getProducto().getPrecio();
		mostrarProductos();
	}
	
	public double venderConCambio(String CodCelda, double valor) 
	{
		Celda celdaAdquirida;
		int inventario;
		double precioProducto;
		double cambio;
		celdaAdquirida = buscarCelda(CodCelda);
		inventario = celdaAdquirida.getStock() - 1;
		celdaAdquirida.setStock(inventario);
		precioProducto = celdaAdquirida.getProducto().getPrecio();
		setSaldo(valor);
		cambio = valor - precioProducto;
		saldo -= cambio;
		return cambio;
	}
	
	public ArrayList<Producto> buscarMenores(double limite)
	{
		ArrayList<Producto> menores = new ArrayList<Producto>();
		Producto elementoProducto =  null;
		for(int i = 0;i<celdas.size();i++)
		{
			elementoProducto = celdas.get(i).getProducto();
			 if(elementoProducto.getPrecio()<limite)
			 {
				 menores.add(elementoProducto);
			 }
		}
		return menores;
	}
}
