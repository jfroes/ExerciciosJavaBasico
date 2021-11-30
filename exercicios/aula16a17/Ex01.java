package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean notaValida = false;

		do {
			System.out.println("Digite uma nota de 0 a 10");
			double nota = scan.nextDouble();

			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				System.out.println("Nota invalida, digite novamente.");
			}
		} while (!notaValida);

	}
}
