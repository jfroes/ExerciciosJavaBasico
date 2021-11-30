package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex07 {

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

		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println("o numero " + num1 + " é o maior número");
		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("o numero " + num2 + " é o maior número");
		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println("o numero " + num3 + " é o maior número");
		} else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.println("o numero " + num4 + " é o maior número");
		} else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
			System.out.println("o numero " + num5 + " é o maior número");
		}

	}

}
