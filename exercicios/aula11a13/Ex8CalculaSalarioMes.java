package com.froes.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class Ex8CalculaSalarioMes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua hora de trabalho: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas trabalha por m�s: ");
		double horasMes = scan.nextDouble();
		
		double salarioMes = valorHora * horasMes;
		
		System.out.println("O seu sal�rio no m�s informado � de R$" + salarioMes);
	}

}
