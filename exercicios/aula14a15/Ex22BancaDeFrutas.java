package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex22BancaDeFrutas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos Kg de morango: ");
		double kgMorango = scan.nextDouble();
		
		System.out.println("Quantos Kg de maçã: ");
		double kgMaca = scan.nextDouble();
		
		double valorMorango = kgMorango * 2.50;
		double valormMaca = kgMaca * 1.80;
		double valorTotal = 0;
		double kgTotal = 0;
		
		if(kgMorango > 5) {
			valorMorango = kgMorango * 2.20;
		}
		
		if(kgMaca > 5) {
			valormMaca = kgMaca * 1.50;
		}
		
		valorTotal = valorMorango + valormMaca;
		kgTotal = kgMorango + kgMaca;
		
		if(kgTotal >= 8 || valorTotal >= 25) {
			
			valorTotal = valorTotal - (valorTotal * 0.10);
		}
		
		System.out.println("Maçã "+ kgMaca + " Kg");
		System.out.println("Morango "+ kgMorango + " Kg");
		System.out.println("Total a pagar = " + valorTotal);
		
	}

}
