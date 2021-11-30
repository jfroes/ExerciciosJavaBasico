package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		int cont = 0;

		System.out.println("Digite a base: ");
		int base = scan.nextInt();

		System.out.println("Digite o expoente: ");
		int pot = scan.nextInt();
		
		int result = base;
		
		for(int i= 1; i < pot; i++) {
			
			result *= base; 
		}

		System.out.println(result);
	}

}
