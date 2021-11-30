package com.froes.cursojava.exercicios.aula14a15;


import java.util.Scanner;

public class Ex10Turno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o turno que você etuda (M-Matutino, V-Vespertio, N-Noturno)");
		String turno = scan.next();
		
		turno = turno.toUpperCase();
		
		switch(turno) {
		case "M" : System.out.println("Bom-dia!");
		break;
		case "V" : System.out.println("Boa-tarde!");
		break;
		case "N" : System.out.println("Boa-noite!");
		break;
		default : System.out.println("Turno inválido");
		break;
		}
	}

}
