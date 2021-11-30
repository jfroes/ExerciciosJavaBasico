package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex14MediaConceito {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;

		if(media >= 9 && media <= 10) {
			System.out.println("Nota 1     Nota 2     Conceito     Situação");
			System.out.println(nota1+"        "+nota2+"          A        APROVADO");
		}else if(media >=7.5 && media <9 ) {
			System.out.println("Nota 1     Nota 2     Conceito     Situação");
			System.out.println(nota1+"        "+nota2+"           B         APROVADO");
		}else if(media >= 6 && media <7.5) {
			System.out.println("Nota 1     Nota 2     Conceito     Situação");
			System.out.println(nota1+"        "+nota2+"           C         APROVADO");
		}else if(media >= 4 && media <6) {
			System.out.println("Nota 1     Nota 2     Conceito     Situação");
			System.out.println(nota1+"        "+nota2+"           D        REPROVADO");
		}else if(media < 4) {
			System.out.println("Nota 1     Nota 2     Conceito     Situação");
			System.out.println(nota1+"        "+nota2+"           E        REPROVADO");
		}
			
	}

}

