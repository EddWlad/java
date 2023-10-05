package com.cmc.directorio.test;

import como.cmc.directorio.entidades.AdminTelefono;
import como.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) 
	{
		Telefono telf = new Telefono(20,"movi","098234234");
		AdminTelefono at = new AdminTelefono();
		at.activarMensajeria(telf);
		
		System.out.println("Operadora: "+telf.getOperadora());
		System.out.println("Numero: "+telf.getNumero());
		System.out.println("Codigo "+telf.getCodigo());
		System.out.println("Tiene Whatsapp: "+telf.isTieneWhatsapp());
	}

}
