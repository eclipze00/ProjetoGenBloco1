package br.com.generation.ProjetoGenTelas;

public class TelaInicial {
	
	String nome;
	String agencia;
	String conta;
	double saldo = 3000;
	
	//double investMais;
	//double investMenos;
	double deposito = 0;
	
	
	//Nome
	void escreva2() {
		System.out.println("|======================|");
		System.out.println("|                      |");
		System.out.println("|   Nome do Cliente:   |");
		System.out.println("|                      |");
		System.out.println("|======================|");
		System.out.println();
	}
	//Agencia
	void ag() {
		System.out.println("|======================|");
		System.out.println("|                      |");
		System.out.println("|  Agência do Cliente: |");
		System.out.println("|                      |");
		System.out.println("|======================|");
		System.out.println();
	//Conta	
	}
	void cont() {
		System.out.println("|======================|");
		System.out.println("|                      |");
		System.out.println("|   Conta do Cliente:  |");
		System.out.println("|                      |");
		System.out.println("|======================|");
		System.out.println();
	}
	//Saldo
		void sal() {
			System.out.println("|==========================|");
			System.out.println("|                          |");
			System.out.println("|   Saldo do cliente é de: |");
			System.out.println("|                          |");
			System.out.println("|==========================|");
			System.out.println();
		
	
	}
	//Deposito
		void dep(double dep1) {
			deposito = saldo + dep1;
			System.out.println("|==========================|");
			System.out.println("|                          |");
			System.out.println("|   Depósito no valor de:  |");
			System.out.println("|                          |");
			System.out.println("|==========================|");
			System.out.println();
	}
		

}
