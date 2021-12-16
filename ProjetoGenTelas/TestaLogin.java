package br.com.generation.ProjetoGenTelas;

public class TestaLogin {

	public static void main(String[] args) {
		
		TelaLogin t1 = new TelaLogin();	
		TelaLogin t2 = new TelaLogin();	
		
		t1.login = "paulo123";
		t1.senha = "*********";
		
		t2.login = "antonio321";
		t2.senha = "*********";
		
		t1.escreva();
		System.out.println(" Login: " + t1.login);
		System.out.println();
		
		t1.password();
		System.out.println(" Senha: " + t1.senha);
		System.out.println();
		
		
		
		t2.error();
		System.out.println(" Login: " + t2.login);
		System.out.println();
		
		
	}
}


