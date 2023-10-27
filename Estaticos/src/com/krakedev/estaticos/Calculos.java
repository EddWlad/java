package com.krakedev.estaticos;

public class Calculos 
{
	// asi se declara constantes final
	private final double iva = 12;
	
	public double calcularIva(double monto)
	{
		return monto*iva/100;
	}
}
