package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean infoValida = false;
		String nome, estadoCivil, sexo;
		int idade;
		double salario;
		
		do {
			System.out.println("Digite o seu nome: ");
			nome = scan.next();
			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome tem que ter no minimo 3 caracteres");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Idade");
			idade = scan.nextInt();
			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("idade inválida");
			}
		}while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("salario");
			salario = scan.nextDouble();
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("valor do salário invalido, precisa ser maior que zero");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Sexo (M - masculino / F - feminino)");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("sexo invalido, digite novamente.'M' ou 'F'");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {

			System.out.println("estado civil ('S'-solteiro(a) / 'C'-casado(a) / 'V' -viuvo(a) / 'D' -divorciado(a)");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C")
					|| estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")) {
				infoValida = true;
			} else {
				System.out.println("Estado civil invalido, digite novamente.");
			}
		} while (!infoValida);

		System.out.println("As seguintes informações foram coletadas: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Salário: " + salario);
		System.out.println("Estado Cívil: " + estadoCivil);
	}

}
