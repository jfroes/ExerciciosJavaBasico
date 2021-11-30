package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double paisA;
		double paisB;
		double taxaA;
		double taxaB;

		boolean valido = false;

		int cont = 0;

		do {
			System.out.println("Entre com a população A: ");
			paisA = scan.nextDouble();

			if (paisA > 0) {
				valido = true;
			} else {
				System.out.println("Populaçõa A precisa ser maior que 0");
			}
		} while (!valido);

		valido = false;

		do {
			System.out.println("Entre com a população B: ");
			paisB = scan.nextDouble();

			if (paisB > 0) {
				valido = true;
			} else {
				System.out.println("Populaçõa B precisa ser maior que 0");
			}
		} while (!valido);

		valido = false;

		do {
			System.out.println("Entre com a taxa de  crescimento de A: ");
			taxaA = scan.nextDouble();

			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento de A precisa ser maior que 0");
			}
		} while (!valido);

		valido = false;

		do {
			System.out.println("Entre com a taxa de  crescimento de B: ");
			taxaB = scan.nextDouble();

			if (taxaB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento de B precisa ser maior que 0");
			}
		} while (!valido);

		while (paisA < paisB) {
			paisA += (paisA / 100) * taxaA;
			paisB += (paisB / 100) * taxaB;
			cont++;
		}

		System.out.println("População A: " + paisA);
		System.out.println("População B: " + paisB);
		System.out.println("Quantos anos: " + cont);

	}

}
