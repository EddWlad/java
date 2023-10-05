package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) 
	{
		Persona p1 = new Persona();
		p1.setNombre("Edison");
		p1.setApellido("Morocho");
		//Instancio el obejeto dir de la clase Direccion
		Direccion dir = new Direccion();
		//coloco los valores a los atributos de direccion
		dir.setCallePrincipal("Graciela Escudero");
		dir.setCalleSecundario("S58C");
		dir.setNumero("E3-63");
		//objetivo p1 de tipo persona con valores de dato tipo direccion
		p1.setDireccion(dir);
		
		String nombre = p1.getNombre();
		Direccion d1 = p1.getDireccion();
		
		System.out.println(nombre);
		//d1 esta null y trato de invocar a un metodo con esa variable
		System.out.println(d1.getCallePrincipal());
		
		p1.imprimir();
		
		Persona p2 = new Persona();
		Direccion d2 = new Direccion("Av. Shirys","Eloy Alfaro","S/N");
		
		p2.setNombre("Wladimir");
		p2.imprimir();
		//null.algun metodo(); error
		
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("xx","yy","123"));
		p3.imprimir();
		
	}

}
