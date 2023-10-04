package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto 
{

	public static void main(String[] args) 
	{
		double promocion;
		Producto p1 = new Producto("Dermosupril",5.5);
		p1.setPrecio(-5.9);
		promocion =p1.calcularPrecioPromo(15);
		
		System.out.println("Precio modificado: "+p1.getPrecio());
		System.out.println("Valor de la promocion: "+promocion);

	}

}
