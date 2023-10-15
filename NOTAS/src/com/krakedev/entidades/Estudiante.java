package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante 
{
	private String nombre;
	private String apellido;
	private String cedula;
	
	private ArrayList<Nota> notas;
	
	
	
	public Estudiante(String cedula, String nombre, String apellido) 
	{
	    this.cedula = cedula;
	    this.nombre = nombre;
	    this.apellido = apellido;
	    this.notas = new ArrayList<Nota>();
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public ArrayList<Nota> getNotas() {
		return notas;
	}



	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}


	public void agregarNota(Nota nuevaNota)
	{
		if(nuevaNota.getCalificacion()>=0 && nuevaNota.getCalificacion()<=10)
		{
			Nota elementoNota;
			for(int i = 0; i<notas.size(); i++)
			{
				elementoNota = notas.get(i);
				if(nuevaNota.getMateria().getCodigo().equals(elementoNota.getMateria().getCodigo()))
				{
					System.out.println("Codigo de materia repetido");
					break;
				}	
			}
			notas.add(nuevaNota);
		}
		else
		{
			System.out.println("La nueva nota debe ser mayor o igual a 0 y menor o igual a 10");
		}
	}
	
	public void modificarNota(String codigo, double nuevaNota)
	{
		Nota elementoNota;
		if(nuevaNota>=0 && nuevaNota<=10)
		{
			for(int i = 0; i<notas.size(); i++)
			{
				elementoNota = notas.get(i);
				if((codigo.equals(elementoNota.getMateria().getCodigo())))
				{
					elementoNota.setCalificacion(nuevaNota);
				}
			}
		}
		else
		{
			System.out.println("La nueva nota debe ser desde 0 a 10");
		}				
	}
	
	public double calcularPromedioNotasEstuidiante()
	{
		
		double elementoNota = 0.0;
		double promedio = 0.0;
		for(int i = 0; i<notas.size(); i++)
		{
			elementoNota += notas.get(i).getCalificacion();	
		}
		promedio = elementoNota/notas.size();
		return promedio;
	}
	
	public void mostrar()
	{
		Nota elementoNota;
		for(int i = 0; i<notas.size(); i++)
		{
			elementoNota = notas.get(i);
			System.out.println("Nombre="+getNombre()+", Apellido="+getApellido()+", Cedula="+getCedula()+", Cod.Materia="+elementoNota.getMateria().getCodigo()+", Materia="+elementoNota.getMateria().getNombre()+", Calificacion="+elementoNota.getCalificacion());
		}
		
	}



	
	
	
	
}
