package com.cmc.directorio.test;

import como.cmc.directorio.entidades.AdminContactos;
import como.cmc.directorio.entidades.Contacto;
import como.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) 
	{
		Contacto contactPesado;
		boolean operadorasIguales;
		
		Contacto contactE = new Contacto("Guayanlema",new Telefono(90,"claro","0993528317"),72.6);
		Contacto contactC = new Contacto("Barros",new Telefono(95,"movi","0963458566"),68.6);
		
		AdminContactos ac = new  AdminContactos();
		contactPesado = ac.buscarMasPesado(contactE, contactC);
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
		
		operadorasIguales= ac.compararOperadoras(contactE, contactC);
		System.out.println("******************************");
		System.out.println("¿Son las operadoras iguales?: "+operadorasIguales);
		
		
	}

}
