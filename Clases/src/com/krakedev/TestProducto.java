package com.krakedev;

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
		
		productoA.nombre = "Escapel";
		productoA.descripcion = "Pastilla de emergencia del dia despues";
		productoA.precio = 5.5;
		productoA.stockActual = 4;
		
		productoB.nombre = "Migradorixina";
		productoB.descripcion = "Pastilla para dolor de cabeza";
		productoB.precio = 0.65;
		productoB.stockActual = 20;
		
		productoC.nombre = "Aspirina efervecente";
		productoC.descripcion = "Polvo de uso oral para dolor de cabeza";
		productoC.precio = 0.35;
		productoC.stockActual = 7;
		
		System.out.println("-----PRODUCTO 1-----");
		System.out.println("Nombre: "+productoA.nombre);
		System.out.println("Descripcion: "+productoA.descripcion);
		System.out.println("Precio: $"+productoA.precio);
		System.out.println("Stock: "+productoA.stockActual+" UND");
		
		System.out.println("-----PRODUCTO 2-----");
		System.out.println("Nombre: "+productoB.nombre);
		System.out.println("Descripcion: "+productoB.descripcion);
		System.out.println("Precio: $"+productoB.precio);
		System.out.println("Stock: "+productoB.stockActual+" UND");
		
		System.out.println("-----PRODUCTO 3-----");
		System.out.println("Nombre: "+productoC.nombre);
		System.out.println("Descripcion: "+productoC.descripcion);
		System.out.println("Precio: $"+productoC.precio);
		System.out.println("Stock: "+productoC.stockActual+" UND");
		
	}

}
