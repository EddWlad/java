package com.cmc.directorio.test;

import como.cmc.directorio.entidades.AdminContactos;
import como.cmc.directorio.entidades.AdminTelefono;
import como.cmc.directorio.entidades.Contacto;
import como.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) 
	{
		Contacto contactOp = new Contacto("Sanchez",new Telefono(16,"movi","0985234755"),90.4);
		System.out.println("Apellido: "+contactOp.getApellido());
		System.out.println("Peso: "+contactOp.getPeso());
		System.out.println("Codigo: "+contactOp.getTelefono().getCodigo());
		System.out.println("Numero: "+contactOp.getTelefono().getNumero());
		System.out.println("Operadora: "+contactOp.getTelefono().getOperadora());
		System.out.println("Esta activo: "+contactOp.isActivo());
		System.out.println("Tiene Whatsapp: "+contactOp.getTelefono().isTieneWhatsapp());
		
		AdminContactos ac = new AdminContactos();
	
		System.out.println("*****************************************");
		
		AdminTelefono at = new AdminTelefono();
		
		at.activarMensajeria(contactOp.getTelefono());
		ac.activarUsuario(contactOp);
		System.out.println("Apellido: "+contactOp.getApellido());
		System.out.println("Peso: "+contactOp.getPeso());
		System.out.println("Codigo: "+contactOp.getTelefono().getCodigo());
		System.out.println("Numero: "+contactOp.getTelefono().getNumero());
		System.out.println("Operadora: "+contactOp.getTelefono().getOperadora());
		System.out.println("Esta activo: "+contactOp.isActivo());
		System.out.println("Tiene Whatsapp: "+contactOp.getTelefono().isTieneWhatsapp());
		

	}

}
