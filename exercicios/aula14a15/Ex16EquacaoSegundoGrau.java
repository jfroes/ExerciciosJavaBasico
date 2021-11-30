package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex16EquacaoSegundoGrau {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("..:: Equa��o de 2� Grau ::..\n\n");
		
		System.out.println("Digite o valor de A");
		int a = scan.nextInt();
		
		if(a == 0){
			System.out.println("A = 0, n�o � uma equa��o de 2� grau");
		}else {
			System.out.println("Digite o valor de B");
			int b = scan.nextInt();
			System.out.println("Digite o valor de C");
			int c = scan.nextInt();
			
			int delta = (b*b) - (4 * a *c) ;
			if(delta < 0) {
				System.out.println("Delta = "+delta+" a equa��o n�o possui raizes");
			}else {
				
				System.out.println("Delta = " + delta);
				
				double x1 = (-b + Math.sqrt(delta)) / (2*a);
				double x2 = (-b - Math.sqrt(delta)) / (2*a);
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
		
	}

}
