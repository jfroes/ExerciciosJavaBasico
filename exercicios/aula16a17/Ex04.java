package com.froes.cursojava.exercicios.aula16a17;

public class Ex04 {

	public static void main(String[] args) {
		int paisA = 80000;
		int paisB = 200000;
		int anos = 0;
		
		while(paisA < paisB) {
			paisA += (paisA/100) * 3;
			paisB += (paisB /100) * 1.5;
			anos++;
		}
		
		System.out.println("Popula��o A: " + paisA);
		System.out.println("Popula��o B: " + paisB);
		System.out.println("Quantos anos: " + anos);
	}

}
