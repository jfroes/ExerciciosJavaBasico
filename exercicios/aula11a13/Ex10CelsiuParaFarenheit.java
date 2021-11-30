package com.froes.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class Ex10CelsiuParaFarenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em ºC: ");
		double celsius = scan.nextDouble();
		
		double farenheit = (celsius * 9/5) +32;
		
		System.out.printf("A temperatura informada em ºC corresponde a "+farenheit + " em ºF");
	}

}
