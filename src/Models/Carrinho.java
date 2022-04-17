package Models;

import java.util.Date;
import java.util.Random;

public class Carrinho {
	
	Random rand = new Random();
	
	int idCarrinho = rand.nextInt(100);
	
	private Cliente cliente;
	
	Date dataCompra = new Date();
	
	public int getIdCarrinho() {
		return idCarrinho;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getDataCompra() {
		return dataCompra;
	}
	
}
