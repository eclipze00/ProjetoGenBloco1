package br.com.generation.ProjetoGenTelas;

import java.util.Scanner;

public class TestaLogin{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		TelaLogin t1 = new TelaLogin();	
		
		
		t1.setLogin("paulo12");
		t1.setSenha("Paulin123!");
		t1.setInvalido("Login ou senha incorretos! Tente novamente");
		
		System.out.println("|========================|");
		System.out.println("|                        |");
		System.out.println("|   Informe seus dados:  |");
		System.out.println("|                        |");
		System.out.println("|========================|");
		System.out.println();
		
				
		System.out.printf("Login: " + t1.getLogin(null));				
		System.out.printf("\nSenha: " + t1.getSenha(null));	
		
	
	}	
}	
										

