package com.krakedev;

public class TestAuto 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.marca = "VolksWagen";
		auto1.año = 2005;
		auto1.precio = 6350;
		
		auto2.marca = "KIA";
		auto2.año = 2022;
		auto2.precio = 14000;
		
		System.out.println("Marca Auto 1: "+auto1.marca);
		System.out.println("Año Auto 1: "+auto1.año);
		System.out.println("Precio Auto 1: "+auto1.precio);
		System.out.println("-----------------------");
		System.out.println("Marca Auto 2: "+auto2.marca);
		System.out.println("Año Auto 2: "+auto2.año);
		System.out.println("Precio Auto 2: "+auto2.precio);
		
	}

}
