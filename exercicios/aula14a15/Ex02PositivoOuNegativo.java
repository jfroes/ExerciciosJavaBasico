package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex02PositivoOuNegativo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Digite um número inteiro positivo ou negativo: ");
		int numero = scan.nextInt();
		
		if(numero > 0) {
			System.out.println("O número " + numero + " é positivo.");
		}else {
			System.out.println("O númeor " + numero + " é negativo.");
		}
	}

}
