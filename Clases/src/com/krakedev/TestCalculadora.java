package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromediar;
		
		Calculadora calcu;
		calcu = new Calculadora();
		
		resultadoSuma = calcu.sumar(5,3);
		resultadoResta = calcu.restar(10,7);
		resultadoMultiplicar = calcu.multiplicar(10,5);
		resultadoDividir = calcu.dividir(10,2);
		resultadoPromediar = calcu.promediar(10,8,9);
		
		
		
		System.out.println("---------------------");
		System.out.println("Multiplicacion: "+resultadoMultiplicar);
		System.out.println("---------------------");
		System.out.println("Division: "+resultadoDividir);
		System.out.println("---------------------");
		System.out.println("Promedio: "+resultadoPromediar);
		System.out.println("---------------------");
		calcu.mostrarResultado();
		
		System.out.println("---------------------");
		System.out.println("RESULTADO DE SUMAR: "+resultadoSuma);
		System.out.println("RESULTADO DE RESTAR: "+resultadoResta);
		
		
		
		
		
	}

}
