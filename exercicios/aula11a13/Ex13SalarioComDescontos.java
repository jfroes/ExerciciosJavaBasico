package com.froes.cursojava.exercicios.aula11a13;

import java.util.Scanner;

public class Ex13SalarioComDescontos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua hora de trabalho: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas trabalha por mês: ");
		double horasMes = scan.nextDouble();
		
		double salarioBruto = valorHora * horasMes;
		
		
		double descontoIR = salarioBruto * 0.11;
		double descontoINSS = salarioBruto * 0.08;
		double descontoSindicato = salarioBruto * 0.05;
		
		double totalDescontos = (descontoINSS + descontoIR + descontoSindicato);
		
		double salarioLiquido = salarioBruto - totalDescontos;
		
		
		System.out.println("Salario Bruto R$" + salarioBruto);
		System.out.println("INSS -R$" + descontoINSS);
		System.out.println("Contribuição Sindical -R$" + descontoSindicato);
		System.out.println("Salario liquido R$" + salarioLiquido);

	}

}
