package com.cmc.directorio.test;

import como.cmc.directorio.entidades.AdminTelefono;
import como.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) 
	{
		int cont;
		Telefono telf = new Telefono(30,"movi","091234214");
		Telefono telf1 = new Telefono(40,"claro","09874844");
		Telefono telf2 = new Telefono(50,"claro","0982347414");
		Telefono telf3 = new Telefono(60,"claro","0988347414");
		
		AdminTelefono at = new AdminTelefono();
		
		cont = at.contarClaro(telf, telf1, telf2, telf3);
		
		System.out.println("El numero de operadora claro es: "+cont);

	}

}
