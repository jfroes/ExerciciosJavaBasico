package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cont =  0;
		int soma =0 ;
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();
		
		while(cont < num1 || cont < num2) {
			
			cont++;
			
			soma = cont + soma;
			
		}
		
		System.out.println(soma);
	}

}
