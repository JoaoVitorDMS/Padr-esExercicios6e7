package View;

import javax.swing.JOptionPane;

import Models.Cliente;

public class ClienteView {

	void clienteView() {
		System.out.println("Cliente\n");

		Cliente cli = new Cliente();

		cli.setNomeCliente(JOptionPane.showInputDialog("Seu nome: "));
		cli.setCpfCliente(JOptionPane.showInputDialog("Seu CPF: "));
		cli.setEmailCliente(JOptionPane.showInputDialog("Seu e-mail: "));
		cli.setEnderecoCliente(JOptionPane.showInputDialog("Seu endereço: "));
		cli.setTelefoneCliente(Integer.parseInt(JOptionPane.showInputDialog("Seu número de telefone: ")));
	}
}
