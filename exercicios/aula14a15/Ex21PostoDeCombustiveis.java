package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex21PostoDeCombustiveis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("G - Gasolina   A - Alcool");
		String combustivel = scan.next();
		
		System.out.println("Quantos Litros?");
		double litro = scan.nextInt();
		
		double preco = 0;
		
		switch(combustivel) {
		
		case "G" : preco = litro * 2.50;
		case "g" : preco = litro * 2.50;
		break;
		case "A" : preco = litro * 1.90;
		case "a" : preco = litro * 1.90;
		break;
		}
		
		if(combustivel.equalsIgnoreCase("G") && litro <= 20 ) {
			
			preco = preco - (preco * 0.03);
			System.out.println("L/ "+litro+"  R$"+preco);
		}else if(combustivel.equalsIgnoreCase("G") && litro > 20){
			preco = preco - (preco * 0.05);
			System.out.println("L/ "+litro+"  R$"+preco);
		}
		
		if(combustivel.equalsIgnoreCase("A") && litro <= 20 ) {
			
			preco = preco - (preco * 0.04);
			System.out.println("L/ "+litro+"  R$"+preco);
		}else if(combustivel.equalsIgnoreCase("A") && litro > 20){
			preco = preco - (preco * 0.06);
			System.out.println("L/ "+litro+"  R$"+preco);
		}
		
		

	}

}
