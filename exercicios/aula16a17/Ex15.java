package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Fibonacci até X");
		System.out.println("Didigite até valor de X: ");
		int x = scan.nextInt();
		
		int proximo = 0;
		int anterior = 0;
		
		while(proximo < x) {
			System.out.println(proximo);
			proximo = proximo + anterior;
			anterior = proximo - anterior;
			
			if(proximo == 0) {
				proximo = proximo +1;
			}
		}
		
		
	}

}
