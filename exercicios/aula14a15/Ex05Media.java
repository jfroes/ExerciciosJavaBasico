package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex05Media {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if(media == 10) {
			System.out.println("Aprovado com Distin��o");
		}else if(media >= 7) {
			System.out.println("Aprovado");
		}else if(media < 7) {
			System.out.println("Reprovado");
		}
	
	
	}
}
