package com.cmc.directorio.test;

import como.cmc.directorio.entidades.Contacto;
import como.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) 
	{
		Telefono telef = new Telefono(80,"claro","0988364473");
		Contacto c = new Contacto("Morocho",telef,78.5);
		System.out.println("Apellido: "+c.getApellido());
		System.out.println("Peso: "+c.getPeso());
		System.out.println("Operadora: "+telef.getOperadora());
		System.out.println("Telefono: "+telef.getNumero());
		
	}

}
