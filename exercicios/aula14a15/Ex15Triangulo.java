package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex15Triangulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("..:: Triangulo ::..");
		System.out.println("");
		System.out.println("Digite o lado A:");
		double ladoA = scan.nextDouble();
		System.out.println("Digite o lado B:");
		double ladoB = scan.nextDouble();
		System.out.println("Digite o lado C:");
		double ladoC = scan.nextDouble();
		
		if(((ladoA + ladoB) > ladoC) || ((ladoB + ladoC) > ladoA) || ((ladoA + ladoC) > ladoB)) {
			if(ladoA == ladoB && ladoB == ladoC) {
				System.out.println("Triangulo Equilatero");
			}else if(ladoA == ladoB || ladoB == ladoC) {
				System.out.println("Triangulo Isósceles");
			}else if(ladoA != ladoB && ladoB!= ladoC) {
				System.out.println("Triangulo Escaleno");
			}
		}else {
			System.out.println("Não é um triangulo");
		}
	}

}
