package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();

		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();

		System.out.println("Digite o terceiro numero: ");
		int num3 = scan.nextInt();

		System.out.println("Digite o quarto numero: ");
		int num4 = scan.nextInt();

		System.out.println("Digite o quinto numero: ");
		int num5 = scan.nextInt();
		
		int  soma = num1 + num2 + num3 + num4 + num5;
		
		int media = soma / 5;
		
		System.out.println("A soma dos números é: " + soma + " e a media é " + media);
		
	}

}
