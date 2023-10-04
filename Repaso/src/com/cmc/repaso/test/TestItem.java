package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) 
	{
		
		Item item = new Item ();
		item.setProductosActuales(20);
		System.out.println("****Valores iniciales****");
		item.imprimir();
		System.out.println("***Valores despues de vender*****");
		item.vender(3);
		item.imprimir();
		System.out.println("***Valores despues de devolver*****");
		item.devolver(2);
		item.imprimir();
		System.out.println(" ");
		
		Item item1 = new Item();
		item1.setProductosActuales(113);
		System.out.println("****Valores iniciales****");
		item1.imprimir();
		System.out.println("***Valores despues de vender*****");
		item1.vender(42);
		item1.imprimir();
		System.out.println("***Valores despues de devolver*****");
		item1.devolver(18);
		item1.imprimir();
		
	}

}
