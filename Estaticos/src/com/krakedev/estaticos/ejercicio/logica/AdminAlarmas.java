package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas 
{
	private ArrayList<Alarma> alarmas = new ArrayList<Alarma>() ;
	
	public void agregarAlarma(Alarma alarma)
	{
		alarmas.add(alarma);
	}

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}

	@Override
	public String toString() 
	{
		Alarma elementoAlarma;
		String notificacionAlarma = "";
		for(int i = 0; i<alarmas.size();i++)
		{
			elementoAlarma = alarmas.get(i);
			
			System.out.println( "Dia: "+elementoAlarma.getDia()+" Hora: "+elementoAlarma.getHora()+" Minutos: "+elementoAlarma.getMinutos());
			
		}
		return notificacionAlarma;
		//return "AdminAlarmas [alarmas=" + alarmas + "]";
	}

	
	
	
}
