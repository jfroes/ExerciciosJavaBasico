package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex13DiaDaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero de 1-7 para o dia da semana");
		int dia = scan.nextInt();
		
		switch(dia) {
		case 1 : System.out.println("Domingo");
		break;
		case 2 : System.out.println("Segunda-feira");
		break;
		case 3 : System.out.println("Ter�a-feira");
		break;
		case 4 : System.out.println("Quarta-feira");
		break;
		case 5 : System.out.println("Quinta-feira");
		break;
		case 6 : System.out.println("Sexta-feira");
		break;
		case 7 : System.out.println("S�bado");
		break;
		default : System.out.println("Dia inv�lido!");
		}
		
	}

}
