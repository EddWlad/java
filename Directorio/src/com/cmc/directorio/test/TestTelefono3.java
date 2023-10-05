package com.cmc.directorio.test;

import como.cmc.directorio.entidades.AdminTelefono;
import como.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) 
	{
		int cont;
		Telefono telf = new Telefono(30,"movi","0982342114");
		Telefono telf1 = new Telefono(40,"claro","098238844");
		Telefono telf2 = new Telefono(50,"movi","0982347414");
		
		AdminTelefono at = new AdminTelefono();
		
		cont = at.contarMovil(telf, telf1, telf2);
		
		System.out.println("El numero de operadora movi es: "+cont);
		
	}

}
