package com.krakedev;

public class Calculadora 
{
	public int sumar(int valor1,int valor2)
	{
		int resultado;
		resultado = valor1 + valor2;
		return resultado;
	}
	
	public int restar(int valor1,int valor2)
	{
		int resultado;
		resultado = valor1 - valor2;
		return resultado;
	}
	
	public double multiplicar(double valor1,double valor2)
	{
		double resultado;
		resultado = valor1 * valor2;
		return resultado;
	}
	
	public double dividir(double dividendo,double divisor)
	{
		double coeficiente;
		coeficiente = dividendo / divisor;
		if(divisor == 0)
		{
			System.out.println("NO EXISTE UNA DIVISION PARA 0");
		}
		return coeficiente;	
	}
	
	
	
}
