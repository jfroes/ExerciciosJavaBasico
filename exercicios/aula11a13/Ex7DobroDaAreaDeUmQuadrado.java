package com.froes.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class Ex7DobroDaAreaDeUmQuadrado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base do quadrado: ");
		double base = scan.nextDouble();
		
		System.out.println("Digite a altura do quadrado: ");
		double altura = scan.nextDouble();
		
		double dobroArea = 2 * (base * altura);
		
		System.out.println("O dobro da área do quadrado informado é: " + dobroArea);
		
	}

}
