package br.com.generation.ProjetoGenTelas;

public class TelaLogin {
	
	String login;
	String senha;	
	String invalido;
	
		
	void escreva() {
		System.out.println("|===================|");
		System.out.println("|                   |");
		System.out.println("|Informe seu login: |");
		System.out.println("|                   |");
		System.out.println("|===================|");
		System.out.println();
	}
	void password() {
		System.out.println("|===================|");
		System.out.println("|                   |");
		System.out.println("|Informe sua senha: |");
		System.out.println("|                   |");
		System.out.println("|===================|");
		System.out.println();
	}
	void error() {
		System.out.println("|===================|");
		System.out.println("|                   |");
		System.out.println("|   Erro no login   |");
		System.out.println("|                   |");
		System.out.println("|===================|");
		System.out.println();
	}

}
