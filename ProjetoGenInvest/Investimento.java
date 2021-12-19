package br.com.generation.ProjetoGenInvest;

public class Investimento {
	
	
	private double fixa; // cdb 
	private double tesouro; // Selic 
	private double variavel; // Criptomoeda
	
		
	public Investimento(double valorIn, double valorOut, double fixa, double tesouro, double variavel) {
		super();
		this.fixa = fixa;
		this.tesouro = tesouro;
		this.variavel = variavel;
	}

	public double getFixa() {
		return fixa;
	}
	public void setFixa(double fixa) {
		this.fixa = fixa;
	}
	public double getTesouro() {
		return tesouro;
	}
	public void setTesouro(double tesouro) {
		this.tesouro = tesouro;
	}
	public double getVariavel() {
		return variavel;
	}
	public void setVariavel(double variavel) {
		this.variavel = variavel;
	}
			

}
