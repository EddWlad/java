package com.krakedev.test;

import com.krakedev.Persona;

public class TestPersona 
{

	public static void main(String[] args) 
	{
		Persona p; //1. Declaro una variable llamda p tipo Persona
		Persona p2 = new Persona();
		Persona p3 = new Persona("Pablo");
		Persona p4 = new Persona("Rocio",43,1.6);
		
		System.out.println("nombre: "+p4.getNombre());
		System.out.println("edad: "+p4.getEdad());
		System.out.println("estatura: "+p4.getEstatura());
		
		
		p = new Persona();//2. Instanciando el objeto referencia con p
		
		System.out.println("nombre: "+p.getNombre());
		System.out.println("edad: "+p.getEdad());
		System.out.println("estatura: "+p.getEstatura());
		
		p2.setNombre("Angelina");
		System.out.println("-----------------------");
		System.out.println("p.nombre: "+p.getNombre());
		System.out.println("p2.nombre: "+p2.getNombre());
		
		//4. modificar atributos
		System.out.println("-----------------------");
		p.setNombre("Mario");
		p.setEdad(45); 
		p.setEstatura(1.56);
		
		System.out.println("nombre: "+p.getNombre());
		System.out.println("edad: "+p.getEdad());
		System.out.println("estatura: "+p.getEstatura());
		
	}

}
