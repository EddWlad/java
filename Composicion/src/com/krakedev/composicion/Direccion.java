package com.krakedev.composicion;

public class Direccion 
{
	private String callePrincipal;
	private String calleSecundario;
	private String numero;
	private double latitud;
	private double longitud;
	
	
	
	
	
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getCalleSecundario() {
		return calleSecundario;
	}
	public void setCalleSecundario(String calleSecundario) {
		this.calleSecundario = calleSecundario;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	public Direccion(String callePrincipal, String calleSecundario, String numero) 
	{
		this.callePrincipal = callePrincipal;
		this.calleSecundario = calleSecundario;
		this.numero = numero;
	}
	
	public Direccion(){} 
	
	
	
}
