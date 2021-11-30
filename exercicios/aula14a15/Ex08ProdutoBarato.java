package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex08ProdutoBarato {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto 1: ");
		double produto1 = scan.nextDouble();
		
		System.out.println("Digite o preço do produto 2: ");
		double produto2 = scan.nextDouble();
		
		System.out.println("Digite o preço do produto 3: ");
		double produto3 = scan.nextDouble();
		
		if(produto1 <= produto2 && produto1 <= produto3) {
			System.out.println("O menor preço é do produto 1 R$" + produto1 + " voce deve optar por ele.");
		}else if(produto2 <= produto1 && produto2 <= produto3) {
			System.out.println("O menor preço é do produto 2 R$" + produto2 + " voce deve optar por ele.");
		}else if (produto3 <= produto1 && produto3 <= produto2){
			System.out.println("O menor preço é do produto 3 R$" + produto3 + " voce deve optar por ele.");
		}
	}

}
