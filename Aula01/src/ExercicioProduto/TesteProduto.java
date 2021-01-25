package ExercicioProduto;

import javax.swing.JOptionPane;

public class TesteProduto {

	public static void main(String[] args) {

		Produto p1 = new Produto(1, "TV", "LG", 2.5, 1400.00);
		Produto p2 = new Produto(2, "Celular", "Motorola", 0.2, 1700.00);
		Produto p3 = new Produto(3, "Computador", "Dell", 2.3, 3200.00);
		Produto p4 = new Produto(4, "Celular", "Apple", 0.23, 3100.00);
		Produto p5 = new Produto(5, "TV", "Panasonic", 2.9, 2400.99);
		
		Produto[] conjuntoProdutos = new Produto[5];
		
		conjuntoProdutos[0] = p1;
		conjuntoProdutos[1] = p2;
		conjuntoProdutos[2] = p3;
		conjuntoProdutos[3] = p4;
		conjuntoProdutos[4] = p5;
		
		int opcao = 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o produto que deseja consultar:"));
			if (opcao >= 0 && opcao <= 4) {
				conjuntoProdutos[opcao].exibeDados();
			} else {
				
				JOptionPane.showMessageDialog(null, "Opção inválida.");
			}
		} while (opcao > 0); 
			
			

	}

}
