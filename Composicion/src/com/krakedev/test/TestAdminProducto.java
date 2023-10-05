package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) 
	{
		//Se decalra una variable del tipo Producto;
		Producto mc;
		//Se instancia el objeteo Adimin Producto para utilizar despues el metodo calcularMasCaro
		AdminProducto admin = new AdminProducto();
		//Se instacion 2 objetos productos con los atributos definiendolos
		Producto productoA = new Producto("Doritos", 0.50);
		Producto productoB = new Producto("Papitas", 0.50);
		//Se llama al metodo buscarMasCaro mediante el objeto admin se guarda en mc porque es un tipo Producto
		mc = admin.buscarMasCaro(productoA, productoB);
		if(mc == null)
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("El mas caro es: "+mc.getNombre());
		}
		
		
	}

}
