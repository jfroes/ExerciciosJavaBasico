package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex01MaiorDeDois {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O maior número é: " + numero1);
		}else {
			System.out.println("O maior número é: " + numero2);
		}
	}

}
