package com.cmc.directorio.test;

import como.cmc.directorio.entidades.AdminContactos;
import como.cmc.directorio.entidades.Contacto;
import como.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) 
	{
		Contacto contactPesado;
		boolean operadorasIguales;
		
		Contacto contactA = new Contacto("Cando",new Telefono(88,"movi","0991144317"),58.2);
		Contacto contactB = new Contacto("Morocho",new Telefono(84,"movi","0963455698"),62.6);
		
		AdminContactos ac = new  AdminContactos();
		contactPesado = ac.buscarMasPesado(contactA, contactB);
		if(contactPesado!=null)
		{
			System.out.println("******Contacto con mas pesaje******");
			System.out.println("Apellido: "+contactPesado.getApellido());
			System.out.println("Peso: "+contactPesado.getPeso());
			System.out.println("Codigo: "+contactPesado.getTelefono().getCodigo());
			System.out.println("Numero: "+contactPesado.getTelefono().getNumero());
			System.out.println("Operadora: "+contactPesado.getTelefono().getOperadora());
		}
		else
		{
			System.out.println("Los contactos tienen igual de pesaje");
		}
		
		operadorasIguales= ac.compararOperadoras(contactA, contactB);
		System.out.println("******************************");
		System.out.println("¿Son las operadoras iguales?: "+operadorasIguales);
		

	}

}
