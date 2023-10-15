package com.krakedev.test;

import com.krakedev.entidades.Curso;
import com.krakedev.entidades.Estudiante;
import com.krakedev.entidades.Materia;
import com.krakedev.entidades.Nota;

public class CursoTest {

	public static void main(String[] args) {
	     Curso curso1 = new Curso();
		 Materia sociales= new Materia("COD1", "Sociales");
		 Materia matematicas= new Materia("COD2", "Matematicas");
		 Materia lenguaje= new Materia("COD3", "Lenguaje");
		 Materia biologia= new Materia("COD4", "Biologia");
		 Materia quimica= new Materia("COD5", "Quimica");
		 Materia geometria= new Materia("COD6", "Geometria");

		 Estudiante estudiante = new Estudiante("1234567890", "Juan", "Perez");
		 Estudiante estudiante2 = new Estudiante("12345678290", "Juan", "Perez");
	     Nota nota1 = new Nota(sociales, 10.0);
	     Nota nota2 = new Nota(matematicas, 10.0);
	     Nota nota3 = new Nota(lenguaje, 10.0);
	     Nota nota4 = new Nota(biologia, 8.0);
	     Nota nota5 = new Nota(quimica, 7.0);
	     Nota nota6 = new Nota(geometria, 7.0);
	     
	     
	     Nota nota11 = new Nota(sociales,5.0);
	     Nota nota12 = new Nota(matematicas, 5.0);
	     Nota nota13 = new Nota(lenguaje, 10.0);
	     Nota nota14 = new Nota(biologia,5.0);
	     Nota nota15 = new Nota(quimica, 6.0);
	     Nota nota16 = new Nota(geometria, 8.0);
	     
	     //Agrega 3 nuevas calificaciones  a Estudiante 1
	     estudiante.agregarNota(nota1);
	     estudiante.agregarNota(nota2);
	     estudiante.agregarNota(nota3);
	     estudiante.agregarNota(nota4);
	     estudiante.agregarNota(nota5);
	     estudiante.agregarNota(nota6);

	     
	     //Agrega 3 nuevas calificaciones  a Estudiante 2
	     estudiante2.agregarNota(nota11);
	     estudiante2.agregarNota(nota12);
	     estudiante2.agregarNota(nota13);
	     estudiante2.agregarNota(nota14);
	     estudiante2.agregarNota(nota15);
	     estudiante2.agregarNota(nota16);
	     
	     
	     curso1.matricularEstudiante(estudiante);
	     curso1.matricularEstudiante(estudiante2);
	     
	     System.out.println(curso1.getEstudiante().size());
	     
	     System.out.println(curso1.calcularPromedioCurso());

	     
	     curso1.mostrar();
}

}