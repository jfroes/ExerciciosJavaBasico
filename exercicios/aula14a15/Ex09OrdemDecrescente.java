package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex09OrdemDecrescente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		int numero3 = scan.nextInt();
		
		if(numero1 >= numero2 && numero1>= numero3 && numero2 >= numero3) {
			System.out.println("numero1 " +numero1 +" numero2 "+numero2+" numero3 "+ numero3);
			
		}else if(numero3 >= numero1 && numero3>= numero2 && numero2 >= numero1) {
			System.out.println("numero3 " +numero3 +" numero2 "+numero2+" numero1 "+ numero1);
			
		}else{
			System.out.println("numero2 " +numero2 +" numero1 "+numero1+" numero3 "+ numero3);
		}
		
	}

}
