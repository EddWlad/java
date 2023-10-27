package com.krakedev.herencia;

public class TestPersona {

	public static void main(String[] args) {
		Persona p = new Persona("1720723640", "Edison");
		System.out.println(p); //aqui llama al toString
		Persona persona = new Persona("1720723632", "Dennys");
		System.out.println(persona);
	}

}
