package com.froes.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class Ex5MetroParaCentimetro {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero de METRO que deseja converter para CENTIMETROS: ");
		
		double metro = scan.nextDouble();
		
		double centimetro = metro * 100;
		
		System.out.println(metro + " metro em centimetros é = " + centimetro);
		

	}

}
