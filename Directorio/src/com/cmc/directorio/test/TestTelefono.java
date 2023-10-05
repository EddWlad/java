package com.cmc.directorio.test;

import como.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) 
	{
		Telefono telf = new Telefono(10,"movi","09941234123");
		System.out.println("Operadora: "+telf.getOperadora());
		System.out.println("Numero: "+telf.getNumero());
		System.out.println("Codigo "+telf.getCodigo());
	}

}
