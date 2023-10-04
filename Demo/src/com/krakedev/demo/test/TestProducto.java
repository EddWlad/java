package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto 
{

	public static void main(String[] args) 
	{
		Producto p1 = new Producto(001,"Leche");
		p1.setDescripcion("Leche descremada VITA");
		p1.setPeso(2.5);
		
		System.out.println("Codigo: "+p1.getCodigo());
		System.out.println("Nombre: "+p1.getNombre());
		System.out.println("Descripcion: "+p1.getDescripcion());
		System.out.println("Peso: "+p1.getPeso());
	}

}
