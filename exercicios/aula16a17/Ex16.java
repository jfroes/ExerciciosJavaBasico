package com.froes.cursojava.exercicios.aula16a17;

public class Ex16 {

	public static void main(String[] args) {
		
		int proximo = 0;
		int anterior = 0;
		
		while(proximo < 501) {
			System.out.println(proximo);
			proximo = proximo + anterior;
			anterior = proximo - anterior;
			
			if(proximo == 0) {
				proximo = proximo +1;
			}
		}
		
		
	}

}
