package br.com.generation.ProjetoGenTelas;

public class TelaInicial {
	
	private String nome;
	private String agencia;
	private String conta;
	private double saldo = 3000;
	private double deposito = 0;
	private double saque = 0;	
	
			

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getDeposito(double dep1) {
		deposito = saldo + dep1;
		saldo = deposito;
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	public double getSaque(double saq1) {
		saque = deposito - saq1; 
		saldo = saque;
		return saque;
	}
	public void setSaque(double saque) {
		this.saque = saque;
	}
		
}
