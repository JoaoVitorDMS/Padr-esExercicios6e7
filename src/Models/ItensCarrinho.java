package Models;

import java.util.Random;

public class ItensCarrinho {
	
	Random rand = new Random();
	
	int idItensCarrinho = rand.nextInt(20);
	
	Double qtItensCarrinho;
	Double valorUnitario;
	
	private Carrinho carrinho;
	
	private Produto produto;

	public int getIdItensCarrinho() {
		return idItensCarrinho;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getQtItensCarrinho() {
		return qtItensCarrinho;
	}

	public void setQtItensCarrinho(double qtItensCarrinho) {
		this.qtItensCarrinho = qtItensCarrinho;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	
	
}
