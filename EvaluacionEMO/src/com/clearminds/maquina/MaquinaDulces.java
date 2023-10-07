package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces 
{
	private Celda celda1 = new Celda("");
	private Celda celda2 = new Celda("");
	private Celda celda3 = new Celda("");
	private Celda celda4 = new Celda("");
	private double saldo = 0.0;
	
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
	
	public void configurarMaquina(String celdaA,String celdaB,String celdaC,String celdaD)
	{
		celda1.setCodigo(celdaA);
		celda2.setCodigo(celdaB);
		celda3.setCodigo(celdaC);
		celda4.setCodigo(celdaD);
	}
	
	public void mostrarConfiguracion()
	{
		System.out.println("CELDA 1:"+celda1.getCodigo());
		System.out.println("CELDA 2:"+celda2.getCodigo());
		System.out.println("CELDA 3:"+celda3.getCodigo());
		System.out.println("CELDA 4:"+celda4.getCodigo());
		System.out.println("SALDO: "+getSaldo());
	}
	
	public Celda buscarCelda(String celdaCodigo)
	{
		if(celdaCodigo == celda1.getCodigo())
		{
			return celda1;
		}
		else if(celdaCodigo == celda2.getCodigo())
		{
			return celda2;
		}
		else if(celdaCodigo == celda3.getCodigo())
		{
			return celda3;
		}
		else if(celdaCodigo == celda4.getCodigo())
		{
			return celda4;
		}
		else
		{
			return null;
		}
	}
	
	public void cargarProducto(Producto producto,String codigo,int saldo)
	{
		Celda celdaRecuperada;
		celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, saldo);
	}
	
	public void mostrarProductos()
	{
		System.out.println("***********CELDA "+celda1.getCodigo());
		System.out.println(" Stock:"+celda1.getStock());
		if (celda1.getProducto() == null)
		{
			System.out.println(" La celda no tiene producto!!!");
		}
		else
		{
			System.out.println(" Nombre Producto:"+celda1.getProducto().getNombre());
			System.out.println(" Precio Prodcuto:"+celda1.getProducto().getPrecio());
			System.out.println(" Codigo Producto:"+celda1.getProducto().getCodigo());
			
		}
		
		System.out.println("***********CELDA "+celda2.getCodigo());
		System.out.println(" Stock:"+celda2.getStock());
		if (celda2.getProducto() == null)
		{
			System.out.println(" La celda no tiene producto!!!");
		}
		else
		{
			System.out.println(" Nombre Producto:"+celda2.getProducto().getNombre());
			System.out.println(" Precio Prodcuto:"+celda2.getProducto().getPrecio());
			System.out.println(" Codigo Producto:"+celda2.getProducto().getCodigo());
		}
		
		
		System.out.println("***********CELDA "+celda3.getCodigo());
		System.out.println(" Stock:"+celda3.getStock());
		if (celda3.getProducto() == null)
		{
			System.out.println(" La celda no tiene producto!!!");
		}
		else
		{
			System.out.println(" Nombre Producto:"+celda3.getProducto().getNombre());
			System.out.println(" Precio Prodcuto:"+celda3.getProducto().getPrecio());
			System.out.println(" Codigo Producto:"+celda3.getProducto().getCodigo());
		}
		
		
		System.out.println("***********CELDA "+celda4.getCodigo());
		System.out.println(" Stock:"+celda4.getStock());
		if (celda4.getProducto() == null)
		{
			System.out.println(" La celda no tiene producto!!!");
		}
		else
		{
			System.out.println(" Nombre Producto:"+celda4.getProducto().getNombre());
			System.out.println(" Precio Prodcuto:"+celda4.getProducto().getPrecio());
			System.out.println(" Codigo Producto:"+celda4.getProducto().getCodigo());
		}
		System.out.println("Saldo: "+saldo);
	}
	
	public Producto buscarProductoEnCelda(String CodCelda)
	{
		if(CodCelda == celda1.getCodigo())
		{
			
			return celda1.getProducto();
		}
		else if(CodCelda == celda2.getCodigo())
		{
			return celda2.getProducto();
		}
		else if(CodCelda == celda3.getCodigo())
		{
			return celda3.getProducto();
		}
		else if(CodCelda == celda4.getCodigo())
		{
			return celda4.getProducto();
		}
		else
		{
			return null;
		}
	}
	
	public double consultarPrecio(String CodCelda)
	{
		if(CodCelda == celda1.getCodigo())
		{
			return celda1.getProducto().getPrecio();
		}
		else if(CodCelda == celda2.getCodigo())
		{
			return celda2.getProducto().getPrecio();
		}
		else if(CodCelda == celda3.getCodigo())
		{
			return celda3.getProducto().getPrecio();
		}
		else if(CodCelda == celda4.getCodigo())
		{
			return celda4.getProducto().getPrecio();
		}
		else
		{
			return 0.0;
		}
	}
	
	public Celda buscarCeldaProducto(String CodProducto)
	{
		if(celda1.getProducto() != null && (CodProducto == celda1.getProducto().getCodigo()))
		{
			return celda1;
		}
		else if(celda2.getProducto() != null && (CodProducto == celda2.getProducto().getCodigo()))
		{
			return celda2;
		}
		else if(celda3.getProducto() != null && (CodProducto == celda3.getProducto().getCodigo()))
		{
			return celda3;
		}
		else if(celda4.getProducto() != null && (CodProducto == celda4.getProducto().getCodigo()))
		{
			return celda4;
		}
		else
		{
			return null;
		}
	}
	
	public void incrementarProductos(String CodProducto,int stock)
	{
		int incrementoStock;
		Celda celdaEncontrada;
		celdaEncontrada = buscarCeldaProducto(CodProducto);
		incrementoStock = celdaEncontrada.getStock();
		celdaEncontrada.setStock(incrementoStock+stock);
		
	}
	
	public void vender(String CodCelda)
	{
		int inventario;
		Celda celdaAdquirida; 
		celdaAdquirida = buscarCelda(CodCelda);
		inventario = celdaAdquirida.getStock()-1;
		celdaAdquirida.setStock(inventario);
		saldo += celdaAdquirida.getProducto().getPrecio();     
	}
	
	public double venderConCambio(String CodCelda, double valor)
	{
		Celda celdaAdquirida;
		int inventario;
		double precioProducto;
		double cambio;
		celdaAdquirida = buscarCelda(CodCelda);
		inventario = celdaAdquirida.getStock()-1;
		celdaAdquirida.setStock(inventario);
		precioProducto = celdaAdquirida.getProducto().getPrecio();
		setSaldo(valor);		
		cambio =  valor - precioProducto;
		saldo -= cambio;
		return cambio;
	}
	
}
