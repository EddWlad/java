package com.krakedev;

public class TestAuto 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.setMarca("VolksWagen");
		auto1.setAño(2005);
		auto1.setPrecio(6350);
		
		auto2.setMarca("KIA");
		auto2.setAño(2022);
		auto2.setPrecio(14000);
		
		System.out.println("Marca Auto 1: "+auto1.getMarca());
		System.out.println("Año Auto 1: "+auto1.getAño());
		System.out.println("Precio Auto 1: "+auto1.getPrecio());
		System.out.println("-----------------------");
		System.out.println("Marca Auto 2: "+auto2.getMarca());
		System.out.println("Año Auto 2: "+auto2.getAño());
		System.out.println("Precio Auto 2: "+auto2.getPrecio());
		
	}

}
