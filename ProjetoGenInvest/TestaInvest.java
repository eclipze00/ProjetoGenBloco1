package br.com.generation.ProjetoGenInvest;

import java.io.IOException;
import java.util.Scanner;

public class TestaInvest extends Investimento {

	public TestaInvest(double valorIn, double valorOut, double fixa, double tesouro, double variavel) {
		super(valorIn, valorOut, fixa, tesouro, variavel);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		Fixa f1 = new Fixa();
		Tesouro t1 = new Tesouro();
		Variavel v1 = new Variavel();		
		char opcao;
		
		
	do {	
		System.out.println("Escolha uma opção de investimento: \nA - Renda Fixa:\nB - Tesouro:\nC - Renda Variavel: ");
		opcao = input.next().charAt(0);
		
		if(opcao == 'A' || opcao == 'a') {
			//Fixa
		f1.setTitulo("CDB IPCA +6,07%");
		f1.setRentA(14.16);
		f1.setInvestMin(100.00);
		f1.setPrecoUni(114.16);
		f1.setVencF("12/12/2022");
		f1.setSobre(  "A principal característica dos fundos da classe “Renda Fixa” que recebem o sufixo “Curto Prazo” está relacionada ao vencimento dos títulos que compõem a sua carteira," 
					+ "\nque precisam respeitar o prazo máximo a decorrer de 375 dias, e prazo médio da carteira inferior a 60 dias" 
			    	+ "\nATENÇÃO: "
			    	+ "Os fundos da classe “Renda Fixa” que recebem os sufixos “Curto Prazo”, “Referenciado” e “Simples” podem utilizar derivativos apenas para proteção da carteira.");
		
		System.out.println("Sobre: " + f1.getSobre());
		System.out.println();
		System.out.println("Nome do título: "  + f1.getTitulo());
		System.out.println("Rentabilidade Anual: " + "R$" + f1.getRentA());
		System.out.println("Investimento Mínimo: " + "R$" + f1.getInvestMin());
		System.out.println("Preço Unitário: " + "R$" + f1.getPrecoUni());
		System.out.println("Vencimento: " + f1.getVencF());
		System.out.println();
		System.out.println("====================================================================================================================================================================================");
				
			}
			
				
		if(opcao == 'B' || opcao == 'b') {
		//Tesouro Direto
		System.out.println();
		t1.setTitulo("Tesouro Prefixado 2024");
		t1.setRentA(10.87);
		t1.setInvestMin(30.84);
		t1.setPrecoUni(771.03);
		t1.setVencF("01/07/2024");
		t1.setSobre("Indicado para aqueles que querem realizar investimentos de curto prazo."
				+ "\nTítulo prefixado, ou seja, no momento da compra, você já sabe exatamente quanto irá receber no futuro "
				+ "\n(sempre R$ 1.000 por unidade de título) " + "\nÉ mais interessante para quem pode deixar o seu dinheiro render até o vencimento do investimento, pois não paga juro semestrais."
				+ "\nEm caso de resgate antecipado, o Tesouro Nacional garante sua recompra pelos seus valores de mercado.");
				
		System.out.println("Sobre: " + t1.getSobre());
		System.out.println();
		System.out.println("Nome do título: "  + t1.getTitulo());
		System.out.println("Rentabilidade Anual: " + "R$" + t1.getRentA());
		System.out.println("Investimento Mínimo: " + "R$" + t1.getInvestMin());
		System.out.println("Preço Unitário: " + "R$" + t1.getPrecoUni());
		System.out.println("Vencimento: " + t1.getVencF());
		System.out.println();
		System.out.println("====================================================================================================================================================================================");
		
			}
		
		if(opcao == 'C' || opcao == 'c') {
		//Variavel
		System.out.println();
		v1.setTitulo("Renda Variavel"); 
		v1.setRentA(12.50); // Porcetagem 
		v1.setInvestMin(250.00); // Valor minimo
		v1.setPrecoUni(1000.00); // valor maximo --> ?
		v1.setVencF("Sem tempo definido."); //tempo de investimento 
		v1.setSobre("A renda variável consiste em diferentes tipos de ativos financeiros com uma mesma característica: rentabilidade imprevisível."
			    + "\nPor isso, seus investimentos costumam estar associados à palavra volatilidade." 
			    + "\nNormalmente, essa instabilidade acontece por esses ativos dependerem muito do cenário econômico e político do país, assim como do desempenho de empresas e áreas do mercado privado."
			    + "\nOu seja, em uma hora seu investimento pode estar subindo e minutos depois caindo próximo a zero.");
			    /*
			    Criptomoedas
				Bitcoin, Tether, Dash, Ripple… os nomes das criptomoedas ficaram bem famosos nos últimos anos. E elas também são consideradas um tipo de renda variável.
				Aqui no blog da CashMe já falamos mais a fundo sobre as criptomoedas, mas, de forma resumida, podemos entendê-las como moedas virtuais usadas como forma de pagamento,
				sem intermédio de bancos.
				Elas são um exemplo bem claro de como a renda variável oscila bastante. Basta avaliar a valorização e desvalorização da bitcoin.*/
				
		System.out.println("Sobre: " + v1.getSobre());
		System.out.println();
		System.out.println("Nome do título: "  + v1.getTitulo());
		System.out.println("Rentabilidade Anual: " + "R$" + v1.getRentA());
		System.out.println("Investimento Mínimo: " + "R$" + v1.getInvestMin());
		System.out.println("Preço Unitário: " + "R$" + v1.getPrecoUni());
		System.out.println("Vencimento: " + v1.getVencF());
		System.out.println();
		System.out.println("====================================================================================================================================================================================");

		
			}
		
		System.out.println("Digite X para sair!");
		System.out.println();
		}
	
		while(opcao != 'x');
		System.out.println("Voltando para tela inicial!");
		
		input.close();
	}
}
