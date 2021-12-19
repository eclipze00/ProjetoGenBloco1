package br.com.generation.ProjetoGenTelas;

public class TelaLogin {
	
	String login;
	String senha;
	String invalido;
	
	public String getLogin(String log1) {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha(String pass1) {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getInvalido(String invalid) {
		if(login == invalido) {
			login = invalido;
						
		if(senha == invalido) {
			senha = invalido;
			}
		}
		return invalido;
	}
	public void setInvalido(String invalido) {
		this.invalido = invalido;
	}
	
		
	
}
