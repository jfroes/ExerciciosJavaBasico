package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex19OperacaoComNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero:");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		int numero2 = scan.nextInt();
		
		System.out.println("Selecione uma opera��o (+ - * /):");
		String operacao = scan.next();
		
		int resultado = 0;
		boolean valida = true;
		
		switch(operacao) {
			case "+" : resultado = numero1 + numero2;
			break;
			case "-" : resultado = numero1 - numero2;
			break;
			case "*" : resultado = numero1 * numero2;
			break;
			case "/" : resultado = numero1 / numero2;
			break;
			default: System.out.println("Opera��o inv�lida");
			 valida = false;
		}
		
		if(valida) {
				System.out.println(resultado);
				
			if(resultado >=0 ) {
				System.out.println("Resultado Positivo");
			}else {
				System.out.println("Resultado Negativo");
			}
			
			
			if(resultado % 2 == 0) {
				System.out.println("Resultado Par");
			}else {
				System.out.println("Resultado �mpar");
			}
		}
		
		
	}
}