package util;

public class Produto {
	private String nomeProduto;
	private double precoUnitario;
	public int quantidadeProduto;
	public double precoTotal;
	
	
	public Produto(String nomeProduto, double precoUnitario, int quantidadeProduto) {
		
		this.nomeProduto = nomeProduto;
		this.precoUnitario = precoUnitario;
		this.quantidadeProduto = quantidadeProduto;
	}


	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}


	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public double getPrecoUnitario() {
		return precoUnitario;
	}
	
	public void calcular() {
		precoTotal = quantidadeProduto * precoUnitario;
	}
	
	
}
