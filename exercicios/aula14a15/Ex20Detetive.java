package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex20Detetive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("☠ D E T E T I V E ☠\n");
		System.out.println("RESPONDA COM SIM OU NÃO\n");
		
		

		System.out.println("Você Telefonou para a vítima?");
		String resposta1 = scan.next();

		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.next();
		
		System.out.println("Mora perto da vítima?");
		String resposta3 = scan.next();
		
		System.out.println("Devia para a vítima?");
		String resposta4 = scan.next();
		
		System.out.println("Já trabalhou com a vítima?");
		String resposta5 = scan.next();
		
		int cont = 0;
		
		if(resposta1.equalsIgnoreCase("s")){
			cont++;
		}
		if(resposta2.equalsIgnoreCase("s")){
			cont++;
		}
		if(resposta3.equalsIgnoreCase("s")){
			cont++;
		}
		if(resposta4.equalsIgnoreCase("s")){
			cont++;
		}
		if(resposta5.equalsIgnoreCase("s")){
			cont++;
		}
		
		if(cont == 2) {
			System.out.println("Suspeita");
		}else if(cont == 3 || cont==4) {
			System.out.println("Cumplice");
		}else if(cont == 5) {
			System.out.println("Assassino");
		}else if(cont == 0) {
			System.out.println("Inocente");
		}
	}

}
