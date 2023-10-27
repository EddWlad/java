package com.krakedev.herencia;

public class Gato extends Animal 
{
	public void maullar()
	{
		System.out.println("Gato maullando");
	}
	
	public void maullar(String adjetivo)
	{
		System.out.println("Gato "+adjetivo+" maullando");
	}
	
	@Override
	public void dormir()
	{
		//super.dormir();// llamada al metodo dormir del padre
		System.out.println("Gato dormido");
	}
	
	
}
