package com.froes.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class Ex11DoisInteirosEUmReal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		int inteiro1 = scan.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		int inteiro2 = scan.nextInt();
		
		System.out.println("Digite um número real: ");
		int real = scan.nextInt();
		
		int produto1 = (inteiro1 * 2) + (inteiro2 / 2) ;
		System.out.println("Prodto do dobro do primeiro com a metade do segundo é: " + produto1);
		
		int produto2 = (inteiro1 * 3) + real;
		System.out.println("Produto da soma do triplo do primeiro com o terceiro é:  " + produto2);
		
		int produto3 = (real * real) * real;
		System.out.println("O número real elevado ao cubo é: " + produto3);
	}

}
