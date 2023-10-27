package com.krakedev.herencia;

public class Perro extends Animal 
{
	public Perro()
	{
		System.out.println("Contructor del perro");
	}
	public void ladrar()
	{
		System.out.println("Perro ladrando");
	}
	
	@Override
	public void dormir()
	{
		super.dormir();// llamada al metodo dormir del padre
		System.out.println("Perro durmiendo");
	}
	
}
