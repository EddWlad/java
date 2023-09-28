package com.krakedev;

public class Rectangulo 
{
	private int base;
	private int altura;
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int calcularArea()
	{
		int area;
		area = getBase() * getAltura();
		return area;
	}
	
	public double calcularPerimetro()
	{
		double perimetro;
		perimetro = (getBase()*2) + (getAltura()*2);
		return perimetro;
	}
	
}
