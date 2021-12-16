package br.com.generation.ProjetoGenTelas;

import java.util.Scanner;

public class TestaInicial {

	public static void main(String[] args) {
					
		TelaInicial l1 = new TelaInicial();
		
		l1.nome = "Paulo da Silva";
		l1.agencia = "0001";
		l1.conta = "293742-0";
		
		l1.escreva2();
			System.out.println("Nome completo: " + l1.nome);
			System.out.println();
		l1.ag();
			System.out.println("Agência: " + l1.agencia);	
			System.out.println();
		l1.cont();
			System.out.println("Conta: " + l1.conta);	
			System.out.println();
			
		l1.sal();
			System.out.println("Saldo de: " + "R$" + l1.saldo);
			System.out.println();	
			
			
		Scanner input = new Scanner(System.in);	
		System.out.printf("Valor à ser adicionado: " + "R$");	
		double dep1 = input.nextDouble();	
		l1.dep(dep1);
			System.out.println("Valor atualizado: " + "R$" + l1.deposito);
			System.out.println();
		
			input.close();
		}

	}

