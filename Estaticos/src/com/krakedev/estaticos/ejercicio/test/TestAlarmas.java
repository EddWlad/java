package com.krakedev.estaticos.ejercicio.test;

import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;

public class TestAlarmas {

	public static void main(String[] args) {
		Alarma alarma1 = new Alarma(DiasSemana.LUNES, 12, 28);
		Alarma alarma2 = new Alarma(DiasSemana.MARTES, 10, 14);
		Alarma alarma3 = new Alarma(DiasSemana.MIERCOLES, 9, 32);
		Alarma alarma4 = new Alarma(DiasSemana.JUEVES, 8, 28);
		Alarma alarma5 = new Alarma(DiasSemana.VIERNES, 21, 42);
		Alarma alarma6 = new Alarma(DiasSemana.SABADO, 13, 5);
		Alarma alarma7 = new Alarma(DiasSemana.DOMINGO, 15, 11);
		
		AdminAlarmas admin = new AdminAlarmas();
		admin.agregarAlarma(alarma1);
		admin.agregarAlarma(alarma2);
		admin.agregarAlarma(alarma3);
		admin.agregarAlarma(alarma4);
		admin.agregarAlarma(alarma5);
		admin.agregarAlarma(alarma6);
		admin.agregarAlarma(alarma7);
		
		ArrayList<Alarma> alarmasActuales = admin.getAlarmas();
		System.out.println(alarmasActuales);
		

	}

}
