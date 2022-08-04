package entities;

public class Produto {

	public String nomeProduto;
	public int quantidade;
	public double valor;

	public Produto() {
		
	}
	
	public Produto( String nomeProduto, int quantidade, double valor) {
		// atributo da classe    parametro recebido no construtor
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;		
		this.valor = valor;
	}
	
	public Produto( String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	/*
	 * public void Estoque() { System.out.println(" temos em estoque : " + ( valor *
	 * quantidade)); }
	 */

	public void AdicionarItem(int qtd) {
		quantidade += qtd;
		
	}
	
	
	public void RemoverItem(int qtd) {
		quantidade -= qtd;
		
	}
	
	public double ValorTotalEmEstoque() {
		return quantidade * valor;
		
		
	}
	
	
	@Override
	public String toString() {

		return " Nome produto : " + nomeProduto + " \n Quantidade : " + quantidade + " \nValor Unitário : " + valor
				+ " \n Valor total em estoque : " + String.format("%.2f" , ValorTotalEmEstoque());

	}

}
