package entities;

public class Produto {

	private String nomeProduto;
	private int quantidade = 0;
	private double valor;

	public Produto() {
		
	}
	
	
	
	public void AdicionarItem(int qtd) {
		quantidade += qtd;
		
	}
	
	
	public void RemoverItem(int qtd) {
		quantidade -= qtd;
		
	}
	
	public double ValorTotalEmEstoque() {
		return quantidade * valor;
		
		
	}
	
	public String GetNomeProduto() {
		return nomeProduto;
	}
	
	public void SetNomeProduto(String nomeProduto) {
		if (nomeProduto.length() > 3) {
			this.nomeProduto = nomeProduto;	
		}else {
			this.nomeProduto = "padrão";
		}
		
		
		
		
	}
	
	
	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public int getQuantidade() {
		return quantidade;
	}



	@Override
	public String toString() {

		return " Nome produto : " + nomeProduto + " \n Quantidade : " + quantidade + " \nValor Unitário : " + valor
				+ " \n Valor total em estoque : " + String.format("%.2f" , ValorTotalEmEstoque());

	}

}
