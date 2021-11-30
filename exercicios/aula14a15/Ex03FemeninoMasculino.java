package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex03FemeninoMasculino {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite F ou M para Feminio ou Masculino");
		String letra = scan.next();

		
		switch(letra) {
		case "F" : System.out.println("Feminino"); 
		break;
		case "f" : System.out.println("Feminino"); 
		break;
		case "M" : System.out.println("Masculino");
		break;
		case "m" : System.out.println("Masculino");
		break;
		default :  System.out.println("Letra Inválida");
		break;
		}
	}

}
