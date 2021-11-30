package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex04VogalOuConsoante {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite Uma letra entre (A-Z)");
		String letra = scan.next();
		letra = letra.toUpperCase();
		
		switch(letra) {
		case "A" : System.out.println("A letra \"" + letra + "\" é uma vogal.");
		break;
		case "E" : System.out.println("A letra \"" + letra + "\" é uma vogal.");
		break;
		case "I" : System.out.println("A letra \"" + letra + "\" é uma vogal.");
		break;
		case "O" : System.out.println("A letra \"" + letra + "\" é uma vogal.");
		break;
		case "U" : System.out.println("A letra \"" + letra + "\" é uma vogal.");
		break;
		default : System.out.println("A letra \"" + letra + "\" é uma consoante.");
		break;
		}
	}

}
