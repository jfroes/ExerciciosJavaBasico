package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o numero de salas: ");
		int salas = scan.nextInt();

		int alunos = 0;
		int soma = 0;
		int media;
		boolean valido = true;
		
		
	
			for (int i = 0; i < salas; i++) {
				valido = true;
			do {
				System.out.println("Digite a quantidade de alunos da sala: " + (i + 1));
				alunos = scan.nextInt();

				if (alunos <= 40) {
				valido = false;
					
				}else {
					System.out.println("numero de alunos não pode ser maior que 40");
				}
			}while (valido);
			soma += alunos;
		} 
		
		
		media = soma / salas;

		System.out.println("A media de alunos por sala é: " + media);
	}

}
