package View;

import javax.swing.JOptionPane;

public class LojaInterface {

	public static void main(String[] args) {
		/*
		 * Cliente cliente = new Cliente(); cliente.setCpfCliente("0000000000");
		 * cliente.setEmailCliente("algo@hotmail.com");
		 * cliente.setEnderecoCliente("Rua a"); cliente.setIdCliente(1);
		 * cliente.setNomeCliente("Fulano"); cliente.setTelefoneCliente(44999999);
		 * 
		 * Produto produto = new Produto(); produto.setIdproduto(1);
		 * produto.setNomeProduto("sab�o"); produto.setPrecoProduto(5.0);
		 * produto.setQtEstoqueProduto(10);
		 * 
		 * Produto produto2 = new Produto(); produto2.setIdproduto(2);
		 * produto2.setNomeProduto("detergente"); produto2.setPrecoProduto(4.50);
		 * produto2.setQtEstoqueProduto(10);
		 * 
		 * Carrinho carrinho = new Carrinho(); carrinho.setCliente(cliente);
		 * carrinho.setIdCarrinho(1);
		 * 
		 * CarrinhoControle carrinhoControle = new CarrinhoControle();
		 * carrinhoControle.adicionarItem(produto, 30.0, 22.0, carrinho);
		 * carrinhoControle.adicionarItem(produto2, 70.0, 15.0, carrinho);
		 * System.out.println(carrinhoControle);
		 */
		menu();
	}

	static void menu() {
		System.out.println("===== Menu =====\n 1- Cliente\n 2- Produto\n 3 - Carrinho\n");
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("sua opção: "));
		while (opcao != 3) {
			switch (opcao) {
				case 1:
					ClienteView visu = new ClienteView();
					visu.clienteView();
					break;
				case 2:
					System.out.println("Produto");
					ProdutoView visu2 = new ProdutoView();
					visu2.produtoView();
					break;
				case 3:
					System.out.println("Carrinho");
					// excluirCarrinho();
					break;
				default:
					System.out.println("Algo deu errado! Tente novamente...");
					menu();
					break;

			}
		}
	}

}