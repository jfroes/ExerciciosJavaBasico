package com.froes.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class Ex3SomaNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int numero2 = scan.nextInt();
		
		System.out.println("A soma dos dois numeros é: " + (numero1 + numero2));

	}

}
