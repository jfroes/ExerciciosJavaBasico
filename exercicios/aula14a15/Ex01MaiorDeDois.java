package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex01MaiorDeDois {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O maior n�mero �: " + numero1);
		}else {
			System.out.println("O maior n�mero �: " + numero2);
		}
	}

}
