package com.froes.cursojava.exercicios.aula16a17;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero");
		int num3 = scan.nextInt();
		
		System.out.println("Digite o quarto numero");
		int num4 = scan.nextInt();
		
		System.out.println("Digite o quinto numero");
		int num5 = scan.nextInt();
		
		System.out.println("Digite o sexto numero");
		int num6 = scan.nextInt();
		
		System.out.println("Digite o setimo numero");
		int num7 = scan.nextInt();
		
		System.out.println("Digite o oitavo numero");
		int num8 = scan.nextInt();
		
		System.out.println("Digite o nono numero");
		int num9 = scan.nextInt();
		
		System.out.println("Digite o decimo numero");
		int num10 = scan.nextInt();
		
		int par = 0;
		int impar = 0;
		
		if(num1 % 2 == 0) {
			par++;
		}else{
			impar++;
			}
		
		if(num2 % 2 == 0) {
			par++;
		}else{
			impar++;
			}
		
		if(num3 % 2 == 0) {
			par++;
		}else{
			impar++;
			}
		
		if(num4 % 2 == 0) {
			par++;
		}else{
			impar++;
			}
		
		if(num5 % 2 == 0) {
			par++;
		}else{
			impar++;
			}
		
		if(num6 % 2 == 0) {
			par++;
		}else{
			impar++;
			}
		
		if(num7 % 2 == 0) {
			par++;
		}else{
			impar++;
			}
		
		if(num8 % 2 == 0) {
			par++;
		}else{
			impar++;
			}
		
		if(num9 % 2 == 0) {
			par++;
		}else{
			impar++;
			}
		
		if(num10 % 2 == 0) {
			par++;
		}else{
			impar++;
			}
		
		System.out.println("Total numero pares: "+par+"\nTotal numeros impares: "+impar);
	}

}
