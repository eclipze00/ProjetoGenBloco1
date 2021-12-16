package br.com.generation.ProjetoGenInvest;

public class Investimento {
	
	private double valorIn; //Valor colocado para investimento
	private double valorOut; //Valor retirado no investimento
	private double fixa; // cdb 
	private double tesouro; // Selic 
	private double variavel; // Criptomoeda
	
	
	
	
	
	public Investimento(double valorIn, double valorOut, double fixa, double tesouro, double variavel) {
		super();
		this.valorIn = valorIn;
		this.valorOut = valorOut;
		this.fixa = fixa;
		this.tesouro = tesouro;
		this.variavel = variavel;
	}
	public double getValorIn() {
		return valorIn;
	}
	public void setValorIn(double valorIn) {
		this.valorIn = valorIn;
	}
	public double getValorOut() {
		return valorOut;
	}
	public void setValorOut(double valorOut) {
		this.valorOut = valorOut;
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
