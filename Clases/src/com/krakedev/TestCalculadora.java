package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultadoSuma;
		int resultadoResta;
		Calculadora calcu;
		calcu = new Calculadora();
		resultadoSuma = calcu.sumar(5,3);
		resultadoResta = calcu.restar(10,7);
		System.out.println("RESULTADO DE SUMAR: "+resultadoSuma);
		System.out.println("RESULTADO DE RESTAR: "+resultadoResta);
		
	}

}
