package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cont = 0;
		int resultado = 0;
		boolean valido = false;

		do {

			System.out.println("Digite um número inteiro entre 1-10:");
			int numero = scan.nextInt();

			if (numero <= 10 && numero > 0) {

				valido = true;
				System.out.println("Gerador de Tabuada\n");
				System.out.println("Tabuada do " + numero);
				while (cont < 10) {
					cont++;
					resultado = numero * cont;

					System.out.println(numero + " X " + cont + " = " + resultado);
				}
			} else {

				System.out.println("número invalido, digite entre 1-10\n");
			}
		} while (!valido);

	}

}
