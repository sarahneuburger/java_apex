package br.com.apex.fundamentos;

import javax.swing.JOptionPane;

public class FabricaCarro {
	
	public static void main(String[] args) {
		
		// Atributos do carro
		
		// Alimentando as variáveis que possuem o mesmo nome da classe carro, mas são diferentes
		// depois serão setadas para as variáveis do carro
		
		String nome = JOptionPane.showInputDialog("Informe o nome do carro:");
		
		String marca = JOptionPane.showInputDialog("Informe a marca do carro:");
		
		String categoria = JOptionPane.showInputDialog("Informe a categoria do carro:");
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro:"));
		
		String cor = JOptionPane.showInputDialog("Informe a cor do carro:");
		
		int qtdPortas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de portas do carro:"));
		
		// Coleta apenas se tem sim ou não, como int
		int temOpcionais = JOptionPane.showConfirmDialog(null, "O carro possui opcionais?", "Opcionais", JOptionPane.YES_NO_OPTION);
		
		// Opcionais em boolean
		boolean opcionais = false; // valor padrão é false, entre no if se for true
		if(temOpcionais == JOptionPane.YES_OPTION) {
			opcionais = true;
		} 
		
		String tipoCombustivel = JOptionPane.showInputDialog("Informe o tipo de combustível:");
		
		Carro c1 = new Carro();
		c1.setNome(nome);
		c1.setMarca(marca);
		c1.setCategoria(categoria);
		c1.setAno(ano);
		c1.setCor(cor);
		c1.setQtdPortas(qtdPortas);
		c1.setOpcionais(opcionais);
		c1.setTipoCombustivel(tipoCombustivel);
		Motor m1 = new Motor();
		int potencia = Integer.parseInt(JOptionPane.showInputDialog("Informe a potência do motor:"));
		int cilindrada = Integer.parseInt(JOptionPane.showInputDialog("Informe a cilindrada do motor:"));
		int qtdValvulas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de válvulas do motor:"));
		m1.setPotencia(potencia);
		m1.setCilindrada(cilindrada);
		m1.setQtdValvulas(qtdValvulas);
		c1.setMotor(m1);
		Pneu p1 = new Pneu();
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do pneu:"));
		int largura = Integer.parseInt(JOptionPane.showInputDialog("Informe a largura do pneu:"));
		int aro = Integer.parseInt(JOptionPane.showInputDialog("Informe o aro do pneu:"));
		String tipo = JOptionPane.showInputDialog("Informe o tipo do pneu:");
		String marcaPneu = JOptionPane.showInputDialog("Informe a marca do pneu:");
		p1.setAltura(altura);
		p1.setLargura(largura);
		p1.setAro(aro);
		p1.setTipo(tipo);
		p1.setMarca(marcaPneu);
		c1.setPneu(p1);
		
		// Para apresentar os dados, aí trazemos pelo get
		System.out.println("Ficha técnica do carro " + nome);
		System.out.println("Nome do carro: " + c1.getNome());
		System.out.println("Marca: " + c1.getMarca());
		System.out.println("Categoria: " + c1.getCategoria());
		System.out.println("Ano:" + c1.getAno());
		System.out.println("Cor: " + c1.getCor());
		System.out.println("Quantidade de portas: " + c1.getQtdPortas());
		System.out.println("Opcionais: " + c1.isOpcionais());
		System.out.println("Tipo de combustível: " + c1.getTipoCombustivel());
		System.out.println("Potência:" + c1.getMotor().getPotencia() + "cv");
		System.out.println("Cilindrada: " + c1.getMotor().getCilindrada());
		System.out.println("Quantidade de válvulas: " + c1.getMotor().getQtdValvulas() + "v");
		System.out.println("Altura do pneu: " + c1.getPneu().getAltura() + "mm");
		System.out.println("Largura do pneu: " + c1.getPneu().getLargura() + "mm");
		System.out.println("Aro do pneu: " + c1.getPneu().getAro() + "\""); // a barra ali anula o erro, pois quero imprimir ". É pra entender o que quero que seja impresso
		System.out.println("Tipo do pneu: " + c1.getPneu().getTipo());
		System.out.println("Marca do pneu: " + c1.getPneu().getMarca());
		
			
		}
		
		
		
		
		
	}


