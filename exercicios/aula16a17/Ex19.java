package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o numero de notas: ");
		int notas = scan.nextInt();

		double soma = 0;
		double nota;
		double media;

		for (int i = 0; i < notas; i++) {
			System.out.println("entre com a nota " + (i + 1));
			nota = scan.nextDouble();

			soma += nota;
		}
		
		media = soma / notas;
		
		System.out.println("soma: " + soma);
		System.out.println("media: "+ media);

	}

}
