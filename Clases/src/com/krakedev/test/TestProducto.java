package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Producto productoA;
		Producto productoB;
		Producto productoC;
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();
		
		productoA.setNombre("Escapel");
		productoA.setDescripcion("Pastilla de emergencia del dia despues");
		productoA.setPrecio(5.5);
		productoA.setStockActual(4);
		
		productoB.setNombre("Migradorixina");
		productoB.setDescripcion("Pastilla para dolor de cabeza");
		productoB.setPrecio(0.65);
		productoB.setStockActual(20);
		
		productoC.setNombre("Aspirina efervecente");
		productoC.setDescripcion("Polvo de uso oral para dolor de cabeza");
		productoC.setPrecio(0.35);
		productoC.setStockActual(7);
		
		System.out.println("-----PRODUCTO 1-----");
		System.out.println("Nombre: "+productoA.getNombre());
		System.out.println("Descripcion: "+productoA.getDescripcion());
		System.out.println("Precio: $"+productoA.getPrecio());
		System.out.println("Stock: "+productoA.getStockActual()+" UND");
		
		System.out.println("-----PRODUCTO 2-----");
		System.out.println("Nombre: "+productoB.getNombre());
		System.out.println("Descripcion: "+productoB.getDescripcion());
		System.out.println("Precio: $"+productoB.getPrecio());
		System.out.println("Stock: "+productoB.getStockActual()+" UND");
		
		System.out.println("-----PRODUCTO 3-----");
		System.out.println("Nombre: "+productoC.getNombre());
		System.out.println("Descripcion: "+productoC.getDescripcion());
		System.out.println("Precio: $"+productoC.getPrecio());
		System.out.println("Stock: "+productoC.getStockActual()+" UND");
		
	}

}
