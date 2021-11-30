package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex11AumentoSalario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double novoSalario;
		double aumento;
		
		System.out.println("Digite o valor do salário:");
		double salarioBase = scan.nextDouble();
		
		if(salarioBase <= 280) {
			aumento = salarioBase * 0.20;
			novoSalario = salarioBase + aumento  ;
			System.out.println("seu salario anterior era de: R$" + salarioBase +"\n+20% de Reajuste \nO valor do aumento é de: R$"+aumento+"\nO novo salario é de: R$" + novoSalario);
		}else if(salarioBase > 280 && salarioBase <=700) {
			aumento = salarioBase * 0.15;
			novoSalario = salarioBase + aumento  ;
			System.out.println("seu salario anterior era de: R$" + salarioBase +"\n+15% de Reajuste \nO valor do aumento é de: R$"+aumento+"\nO novo salario é de: R$" + novoSalario);
		}else if(salarioBase > 700 && salarioBase <= 1500) {
			aumento = salarioBase * 0.10;
			novoSalario = salarioBase + aumento  ;
			System.out.println("seu salario anterior era de: R$" + salarioBase +"\n+10% de Reajuste \nO valor do aumento é de: R$"+aumento+"\nO novo salario é de: R$" + novoSalario);
		}else if(salarioBase > 1500) {
			aumento = salarioBase * 0.05;
			novoSalario = salarioBase + aumento  ;
			System.out.println("seu salario anterior era de: R$" + salarioBase +"\n+5% de Reajuste \nO valor do aumento é de: R$"+aumento+"\nO novo salario é de: R$" + novoSalario);
		}
	}

}
