package com.krakedev.evaluacion;

public class Telefono 
{
	private String numero;
	private String tipo;
	private String estado;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Telefono(String numero, String tipo) 
	{
		this.numero = numero;
		this.tipo = tipo;
		validacionTelefono();
	}
	
	public void validacionTelefono()
	{
		String tipoA = "Movil";
		String tipoB = "Convencional";
		String estadoA = "E";
		String estadoB = "C";
		if(numero != null && tipo != null)
		{
			if(tipo.equalsIgnoreCase(tipoA))
			{
				if(numero.length()==10)
				{
					setEstado(estadoB);
				}
				else
				{
					setEstado(estadoA);
				}
			}
			else if(tipo.equalsIgnoreCase(tipoB))
			{
				if(numero.length()==7)
				{
					setEstado(estadoB);
				}
				else
				{
					setEstado(estadoA);
				}
			}
			else
			{
				setEstado(estadoA);
			}
		}
		else
		{
			setEstado(estadoA);
		}
		
	}	
}
