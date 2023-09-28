package com.krakedev;

public class Cuadrado 
{
	private double lado;
	
	public Cuadrado (double lado)
	{
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea()
	{
		double area;
		area = getLado()*getLado();
		return area;
	}
	
	public double calcularPerimetro()
	{
		double perimetro;
		perimetro = getLado()*4;
		return perimetro;
	}
	
}
