package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto 
{
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	
	
	
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
		
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefonos = new ArrayList<Telefono>();
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void imprimir()
	{
		System.out.println("Cedula: "+getCedula());
		System.out.println("Nombre: "+getNombre());
		System.out.println("Apellido: "+getApellido());
		System.out.println("Direccion:");
		if (direccion != null) {
	        System.out.println("  Calle Principal: " + direccion.getCallePrincipal());
	        System.out.println("  Calle Secundaria: " + direccion.getCalleSecundaria());
	    } else {
	        System.out.println("  Dirección no especificada");
	    }
	}
	
	/*public void imprimir()
	{
		System.out.println("***"+getNombre()+" "+getApellido()+"****");
		if (direccion != null)
		{
			System.out.println("Direccion: "+direccion.getCallePrincipal()+" y "+direccion.getCalleSecundaria());
		}
		else
		{
			System.out.println("No tiene asociada una direccion");
		}
	}*/
	
	public void agregarTelefono(Telefono telefono)
	{
		telefonos.add(telefono);
	}
	
	public void mostrarTelefonos()
	{
		System.out.println("Telefonos con estado 'C':");
		Telefono elementoTelefono;
		for(int i=0;i<telefonos.size();i++)
		{
			elementoTelefono = telefonos.get(i);
			if(elementoTelefono.getEstado().equalsIgnoreCase("C"))
			{
				System.out.println("Numero: "+elementoTelefono.getNumero()+", Tipo; "+elementoTelefono.getTipo());
			}
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos()
	{
		ArrayList<Telefono> telefonosIncorrectos = new ArrayList<Telefono>();
		Telefono elementoTelefono;
		for(int i=0;i<telefonos.size();i++)
		{
			elementoTelefono = telefonos.get(i);
			if(elementoTelefono.getEstado().equalsIgnoreCase("E"))
			{
				telefonosIncorrectos.add(elementoTelefono);
			}
		}
		return telefonosIncorrectos;
	}
	
}
