package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso 
{
	private ArrayList<Estudiante> estudiante;
	
	public Curso() {
		estudiante = new ArrayList<Estudiante>();
	}
	
	public ArrayList<Estudiante> getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(ArrayList<Estudiante> estudiantes) {
		this.estudiante = estudiantes;
	}

	public String buscarEstudiantePorCedula(Estudiante estudiante)
	{
		String mensaje = "Estudiante se encuentra en curso";
		Estudiante elementoEstudiante;
		for(int i = 0; i<this.estudiante.size(); i++)
		{
			elementoEstudiante = this.estudiante.get(i);
			if(estudiante.getCedula().equals(elementoEstudiante.getCedula()))
			{
				return mensaje;	
			}
		}
		return null;
	}
	
	

	public void matricularEstudiante(Estudiante estudiante)
	{
		String elementoEstudiante = buscarEstudiantePorCedula(estudiante);
		if(elementoEstudiante == null)
		{
			this.estudiante.add(estudiante);
		}
		else
		{
			System.out.println("El estudiante ya se encuentra matriculado");;	
		}	
	}
	
	public double calcularPromedioCurso()
	{
		Estudiante elementoEstudiante;
		double notasTotalesCurso = 0;
		int cantidadNotas = 0;
		for(int i = 0; i<this.estudiante.size(); i++)
		{
			elementoEstudiante = this.estudiante.get(i);
			notasTotalesCurso += elementoEstudiante.calcularPromedioNotasEstuidiante();
			cantidadNotas++;	
		}
		
		if (cantidadNotas > 0) {
	        return notasTotalesCurso / cantidadNotas;
	    } else {
	        return 0.0;
	    }
	}
	
	public void mostrar()
	{
		Estudiante elementoEstudiante;
		for(int i = 0; i<this.estudiante.size(); i++)
		{
			elementoEstudiante = this.estudiante.get(i);
			System.out.println("Nombre="+elementoEstudiante.getNombre()+", Apellido="+elementoEstudiante.getApellido()+", Cedula="+elementoEstudiante.getCedula()+", CodMateria="+elementoEstudiante.getNotas().get(i).getMateria().getCodigo()+", Materia="+elementoEstudiante.getNotas().get(i).getMateria().getNombre()+", Calificacion="+elementoEstudiante.getNotas().get(i).getCalificacion());
			
		}
	}
	
}
