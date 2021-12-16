package br.com.generation.ProjetoGenInvest;

public class TestaInvest extends Investimento {

	public TestaInvest(double valorIn, double valorOut, double fixa, double tesouro, double variavel) {
		super(valorIn, valorOut, fixa, tesouro, variavel);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Fixa f1 = new Fixa();
		Tesouro t1 = new Tesouro();
		Variavel v1 = new Variavel();
		
		
		//Fixa
		f1.setTitulo("CDB IPCA +6,07%");
		f1.setRentA(14.16);
		f1.setInvestMin(100.00);
		f1.setPrecoUni(114.16);
		f1.setVencF("12/12/2022");
		f1.setSobre("");
		
		System.out.println("Sobre: " + f1.getSobre());
		System.out.println();
		System.out.println("Nome do título: "  + f1.getTitulo());
		System.out.println("Rentabilidade Anual: " + "R$" + f1.getRentA());
		System.out.println("Investimento Mínimo: " + "R$" + f1.getInvestMin());
		System.out.println("Preço Unitário: " + "R$" + f1.getPrecoUni());
		System.out.println("Vencimento: " + f1.getVencF());
		System.out.println();
		System.out.println("================================================================================================================================================================");
		
		
		
		//Tesouro Direto
		System.out.println();
		t1.setTitulo("Tesouro Prefixado 2024");
		t1.setRentA(10.87);
		t1.setInvestMin(30.84);
		t1.setPrecoUni(771.03);
		t1.setVencF("01/07/2024");
		t1.setSobre("Indicado para aqueles que querem realizar investimentos de curto prazo."
				+ "\nTítulo prefixado, ou seja, no momento da compra, você já sabe exatamente quanto irá receber no futuro "
				+ "(sempre R$ 1.000 por unidade de título) " + "\nÉ mais interessante para quem pode deixar o seu dinheiro render até o vencimento do investimento, pois não paga juro semestrais."
				+ "\nEm caso de resgate antecipado, o Tesouro Nacional garante sua recompra pelos seus valores de mercado.");
				
		
		System.out.println("Sobre: " + t1.getSobre());
		System.out.println();
		System.out.println("Nome do título: "  + t1.getTitulo());
		System.out.println("Rentabilidade Anual: " + "R$" + t1.getRentA());
		System.out.println("Investimento Mínimo: " + "R$" + t1.getInvestMin());
		System.out.println("Preço Unitário: " + "R$" + t1.getPrecoUni());
		System.out.println("Vencimento: " + t1.getVencF());
		System.out.println();
		System.out.println("================================================================================================================================================================");

		//Variavel
		System.out.println();
		v1.setTitulo("Tesouro Prefixado 2024");
		v1.setRentA(10.87);
		v1.setInvestMin(30.84);
		v1.setPrecoUni(771.03);
		v1.setVencF("01/07/2024");
		v1.setSobre("Indicado para aqueles que querem realizar investimentos de curto prazo."
				+ "\nTítulo prefixado, ou seja, no momento da compra, você já sabe exatamente quanto irá receber no futuro "
				+ "(sempre R$ 1.000 por unidade de título) " + "\nÉ mais interessante para quem pode deixar o seu dinheiro render até o vencimento do investimento, pois não paga juro semestrais."
				+ "\nEm caso de resgate antecipado, o Tesouro Nacional garante sua recompra pelos seus valores de mercado.");
				
		
		System.out.println("Sobre: " + t1.getSobre());
		System.out.println();
		System.out.println("Nome do título: "  + t1.getTitulo());
		System.out.println("Rentabilidade Anual: " + "R$" + t1.getRentA());
		System.out.println("Investimento Mínimo: " + "R$" + t1.getInvestMin());
		System.out.println("Preço Unitário: " + "R$" + t1.getPrecoUni());
		System.out.println("Vencimento: " + t1.getVencF());

	}

}
