package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex07MaiorMenorDeTres {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite o primeiro valor inteiro: ");
			int numero1 = scan.nextInt();
			
			System.out.println("Digite o segundo valor inteiro: ");
			int numero2 = scan.nextInt();
			
			System.out.println("Digite o terceiro valor inteiro: ");
			int numero3 = scan.nextInt();
			
	
			if(numero1 >= numero2 && numero1 >= numero3) {
				System.out.println("O maior numero é o numero1 " + numero1);
			}else if(numero2 >= numero1 && numero2 >= numero3) {
				System.out.println("O maior numero é o numero2 " + numero2);
			}else if (numero3 >= numero1 && numero3 >= numero2){
				System.out.println("O maior numero é o numero3 " + numero3);
			}
			
			if(numero1 <= numero2 && numero1 <= numero3) {
				System.out.println("O menor numero é o numero1 " + numero1);
			}else if(numero2 <= numero1 && numero2 <= numero3) {
				System.out.println("O menor numero é o numero2 " + numero2);
			}else if (numero3 <= numero1 && numero3 <= numero2){
				System.out.println("O menor numero é o numero3 " + numero3);
			}
			
			
	}
}
