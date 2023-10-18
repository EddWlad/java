package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio 
{
	ArrayList<Contacto> contactos;
	Date fechaModificacion;
	ArrayList<Contacto> correctos;
	ArrayList<Contacto> incorrectos;
	
	  public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Directorio() 
	  {
		  contactos = new ArrayList<Contacto>();
		  fechaModificacion = new Date();
	  }
	
	public boolean agregarContacto(Contacto contacto)
	{
		
		Contacto contactoExistente = buscarPorCedula(contacto.getCedula());
		if(contactoExistente == null)
		{
			contactos.add(contacto);
			fechaModificacion = new Date();
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public Contacto buscarPorCedula(String contacto)
	{
		Contacto contactoEncontrado = null;
		Contacto elementoContacto;
		for(int i=0;i<contactos.size();i++)
		{
			elementoContacto = contactos.get(i);
			if(elementoContacto.getCedula().equals(contacto))
			{
				contactoEncontrado =  elementoContacto;
				break;
			}	
		}
		return contactoEncontrado;	
	}
	
	public String consultarUltimaModificacion()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return sdf.format(fechaModificacion);
		
	}
	
	public int contarPerdidos()
	{
		int contactosPerdidos = 0;
		Contacto elementoContacto;
		for(int i =0;i<contactos.size();i++)
		{
			elementoContacto = contactos.get(i);
			if(elementoContacto.getDireccion()== null)
			{
				contactosPerdidos++;
			}
		}
		return contactosPerdidos;
	}
	
	public int contarFijos()
	{
		int contactosFijos = 0;
		for (Contacto contacto : contactos) 
		{
	        for (Telefono telefono : contacto.getTelefonos()) 
	        {
	            if (telefono.getTipo().equalsIgnoreCase("Convencional") && telefono.getEstado().equalsIgnoreCase("C")) 
	            {
	                contactosFijos++;
	                break; 
	            }
	        }
	    }
	    return contactosFijos;
	}
	
	public void depurar()
	{
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
		Contacto elementoContacto;
		for(int i=0; i<contactos.size();i++)
		{
			elementoContacto = contactos.get(i);
			if(elementoContacto.getDireccion()!=null)
			{
				correctos.add(elementoContacto);	
			}
			else if(elementoContacto.getDireccion()==null)
			{
				incorrectos.add(elementoContacto);	
			}
		}
		contactos.clear();
	}   

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
}
