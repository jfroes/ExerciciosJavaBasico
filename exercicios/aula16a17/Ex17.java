package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para o calculo fatorial: ");
		int numero = scan.nextInt();
		
		int fatorial = 1;
		
		for(int i = numero; i > 0; i--) {
			fatorial *= i;
		}
		
		System.out.println(numero +"! = " + fatorial);
	}

}
