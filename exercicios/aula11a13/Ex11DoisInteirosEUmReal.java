package com.froes.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class Ex11DoisInteirosEUmReal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero inteiro: ");
		int inteiro1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero inteiro: ");
		int inteiro2 = scan.nextInt();
		
		System.out.println("Digite um n�mero real: ");
		int real = scan.nextInt();
		
		int produto1 = (inteiro1 * 2) + (inteiro2 / 2) ;
		System.out.println("Prodto do dobro do primeiro com a metade do segundo �: " + produto1);
		
		int produto2 = (inteiro1 * 3) + real;
		System.out.println("Produto da soma do triplo do primeiro com o terceiro �:  " + produto2);
		
		int produto3 = (real * real) * real;
		System.out.println("O n�mero real elevado ao cubo �: " + produto3);
	}

}
