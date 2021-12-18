package br.com.generation.ProjetoGenTelas;

import java.io.IOException;
import java.util.Scanner;

public class TestaInicial {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);				
		TelaInicial l1 = new TelaInicial();
		
		char opcao;
		double dep1 = 0;
		double saq1 = 0;
		double ext1 = 0; 
		
		l1.setNome("Paulo da Silva");
		l1.setAgencia("0001");
		l1.setConta("293742-0");
		
			System.out.println("|======================|");
			System.out.println("|                      |");
			System.out.println("|   Dados do cliente:  |");
			System.out.println("|                      |");
			System.out.println("|======================|");
			System.out.println();
			System.out.println("Nome completo: " + l1.getNome());
			System.out.println();
		
			System.out.println("Ag�ncia: " + l1.getAgencia());	
			System.out.println();
		
			System.out.println("Conta: " + l1.getConta());	
			System.out.println();
			
			
			do {		
				System.out.println("Escolha uma op��o (A/B/C/D): ");
				opcao = (char)System.in.read();
									
				if(opcao == 'A' || opcao == 'a') {
				System.out.println("Saldo de: " + "R$" + l1.getSaldo());
				System.out.println();					
				}
				
				
			
				if(opcao == 'B' || opcao == 'b') {			
				System.out.printf("Valor � ser adicionado: " + "R$");	
				dep1 = input.nextDouble();
				System.out.println("\nValor atualizado: " + "R$" + l1.getDeposito(dep1));			
				System.out.println();
				}
				
			
				if(opcao == 'C'|| opcao == 'c') {
				System.out.printf("Valor � ser retirado: " + "R$");	
				saq1 = input.nextDouble();
				System.out.println("\nValor retirado: " + "R$" + l1.getSaque(saq1));			
				System.out.println();
				}
				
			
				if(opcao == 'D'|| opcao == 'd') {
				System.out.println("Transi��es realizadas: " + "R$" + l1.getExtrato(ext1));
				ext1 = input.nextDouble();
				}										
			}
			while(opcao != 'x');
			System.out.println("Sess�o finalizada!");
			
			input.close();
	}
}

