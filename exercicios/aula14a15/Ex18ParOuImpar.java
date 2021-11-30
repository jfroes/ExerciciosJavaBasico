package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex18ParOuImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("..::Par ou Impar::..\n");
		
		System.out.println("Digite um número iteiro: ");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " É par.");
		}else {
			System.out.println(numero + " É ímpar.");
		}

	}

}
