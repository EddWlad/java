package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) 
	{
		Estudiante estudiante = new Estudiante("Edison");
		estudiante.calificar(5);
		estudiante.calificar(8);

	}

}
