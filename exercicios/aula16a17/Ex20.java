package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de pessoas: ");
		int pessoas = scan.nextInt();
		
		int idade;
		int soma = 0;
		int media;
		
		for(int i =0; i < pessoas; i++) {
			System.out.println("Entre com a idade da pessoa " + (i +1));
			idade = scan.nextInt();
			
			soma += idade;
		}
		
		media = soma / pessoas;
		
		if(media >= 0 && media <= 25) {
			System.out.println("A turmar é jovem, sendo a media de idade " + media);
		}else if(media >= 26 && media <= 60 ) {
			System.out.println("A turmar é adulta, sendo a media de idade " + media);
		}else if(media > 60) {
			System.out.println("A turmar é idosa, sendo a media de idade " + media);
		}
	
	}

}
