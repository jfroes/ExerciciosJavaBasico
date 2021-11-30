package com.froes.cursojava.exercicios.aula14a15;

import java.util.Scanner;

public class Ex12FolhaPagamento {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da Hora de trabalho: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas trabalhou: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		
		double fgts = salarioBruto * 0.11;
		
		double sindcato = salarioBruto * 0.03;
		
		double inss = salarioBruto * 0.10;
		
		double ir = 0;
		
		double totalDescontos = ir + inss + sindcato;
				
		double salarioLiquido;
		
		if(salarioBruto <= 900) {
			
			salarioLiquido = salarioBruto - totalDescontos;
			
			System.out.println("Salário Bruto: (R$/hora "+valorHora+"  Horas:" + horasTrabalhadas+")" +"     = R$  "+salarioBruto);
			System.out.println("(-) IR (ISENTO)                               = ISENTO");
			System.out.println("(-) Sindicato (3%)                            = R$"+sindcato);
			System.out.println("(-) INSS (10%)                                = R$"+inss);
			System.out.println("FGTS (11%)                                    = R$"+fgts);
			System.out.println("Total de Descontos                            = R$"+totalDescontos);
			System.out.println("Salário Liquido                               = R$"+salarioLiquido);
			
		}else if(salarioBruto > 900 && salarioBruto <= 1500) {
			ir =salarioBruto * 0.05;
			totalDescontos = totalDescontos + ir;
			salarioLiquido = salarioBruto - totalDescontos;
			
			System.out.println("Salário Bruto: (R$/hora "+valorHora+"  Horas:" + horasTrabalhadas+")" +"    = R$  "+salarioBruto);
			System.out.println("(-) IR (5%)                                   = R$"+ir);
			System.out.println("(-) Sindicato (3%)                            = R$"+sindcato);
			System.out.println("(-) INSS (10%)                                = R$"+inss);
			System.out.println("FGTS (11%)                                    = R$"+fgts);
			System.out.println("Total de Descontos                            = R$"+totalDescontos);
			System.out.println("Salário Liquido                               = R$"+salarioLiquido);
			
		}else if(salarioBruto > 1501 && salarioBruto <= 2500) {
			ir =salarioBruto * 0.10;
			totalDescontos = totalDescontos + ir;
			salarioLiquido = salarioBruto - totalDescontos;
			
			System.out.println("Salário Bruto: (R$/hora "+valorHora+"  Horas:" + horasTrabalhadas+")" +"    = R$  "+salarioBruto);
			System.out.println("(-) IR (10%)                                   = R$"+ir);
			System.out.println("(-) Sindicato (3%)                            = R$"+sindcato);
			System.out.println("(-) INSS (10%)                                = R$"+inss);
			System.out.println("FGTS (11%)                                    = R$"+fgts);
			System.out.println("Total de Descontos                            = R$"+totalDescontos);
			System.out.println("Salário Liquido                               = R$"+salarioLiquido);
			
		}else if(salarioBruto> 2500) {
			ir =salarioBruto * 0.20;
			totalDescontos = totalDescontos + ir;
			salarioLiquido = salarioBruto - totalDescontos;
			
			System.out.println("Salário Bruto: (R$/hora "+valorHora+"  Horas:" + horasTrabalhadas+")" +"    = R$  "+salarioBruto);
			System.out.println("(-) IR (20%)                                   = R$"+ir);
			System.out.println("(-) Sindicato (3%)                            = R$"+sindcato);
			System.out.println("(-) INSS (10%)                                = R$"+inss);
			System.out.println("FGTS (11%)                                    = R$"+fgts);
			System.out.println("Total de Descontos                            = R$"+totalDescontos);
			System.out.println("Salário Liquido                               = R$"+salarioLiquido);
		}
	}

}
