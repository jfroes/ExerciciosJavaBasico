package com.froes.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class Ex9FarenheitParaCelsius {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em ºF: ");
		double farenheit = scan.nextDouble();
		
		double celsius = (5 * (farenheit -32 ) /9);
		
		System.out.printf("A temperatura informada em ºF corresponde a "+ celsius + " em ºC.");
		
	}

}
