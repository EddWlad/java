package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Fecha fecha1 = new Fecha();
		fecha1.setAño(2000);
		fecha1.setMes(12);
		fecha1.setDia(12);
		
		System.out.println(fecha1.getAño());
		System.out.println(fecha1.getMes());
		System.out.println(fecha1.getDia());
	}

}
