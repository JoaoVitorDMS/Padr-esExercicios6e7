package View;

import javax.swing.JOptionPane;

import Models.Produto;

public class ProdutoView {

    void produtoView() {
        System.out.println("Produto");

        Produto prod = new Produto();

        prod.setNomeProduto(JOptionPane.showInputDialog("Nome do produto: "));
        prod.setPrecoProduto(Double.parseDouble(JOptionPane.showInputDialog("Preço do produto: ")));
        prod.setQtEstoqueProduto(Integer.parseInt(JOptionPane.showInputDialog("Quantidade do produto: ")));

    }
}
