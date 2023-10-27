package com.krakedev.estaticos.ejercicio.utils;

public class Util 
{
	public static String formatearHora(int valorEntero)
	{
		String valor = "0"+valorEntero;
		return valor;
	}
	
	public static String formatearDia(int valorEntero)
	{
		String dia = "";
		if(valorEntero == 0)
		{
			dia = "Lunes";
		}
		else if(valorEntero == 1)
		{
			 dia = "Martes";
		}
		else if(valorEntero == 2)
		{
			 dia = "Miercoles";
		}
		else if(valorEntero == 3)
		{
			 dia = "Jueves";
		}
		else if(valorEntero == 4)
		{
			 dia = "Viernes";
		}
		else if(valorEntero == 5)
		{
			 dia = "Sabado";
		}
		else if(valorEntero == 6)
		{
			 dia = "Domingo";
		}
		else
		{
			dia = "ERROR NUMERO INVALIDO";
		}
		return dia;
	}
	
}
