package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex17AnoBissexto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("..:: ANO BISSEXTO ::..\n");
		System.out.println("Digite o ano: ");
		int ano = scan.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println(ano +" é um ano bissexto.");
		}else {
			System.out.println(ano +" Não é um ano bissexto.");
		}
	}

}
