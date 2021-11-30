package com.froes.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class Ex6AreaCirculo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		double raio = scan.nextDouble();
		
		double area = 3.14 * (raio * raio);
		
		System.out.println("A área do círculo informado é: " + area);
	}

}
