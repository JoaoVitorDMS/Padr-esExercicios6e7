package Models;

import java.util.Random;

public class Cliente {
	
	Random rand = new Random();
	
	int idCliente = rand.nextInt(50);
	int telefoneCliente;
	
	String cpfCliente;
	String nomeCliente;
	String enderecoCliente;
	String emailCliente;
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public int getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(int telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
	
}
