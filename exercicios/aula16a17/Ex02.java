package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infosValidas = false;

		String nomeUser;
		String senha;

		do {

			System.out.println("Digite o nome de usu�rio: ");
			nomeUser = scan.next();

			System.out.println("Digite a senha: ");
			senha = scan.next();

			if (nomeUser.equalsIgnoreCase(senha)) {
				infosValidas = false;
				System.out.println("Senha igual a usu�rio, digite noamente.");
			} else {
				infosValidas = true;
				System.out.println("Senhas e usu�rios validos");
			}

		} while (!infosValidas);

	}

}
