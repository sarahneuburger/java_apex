package br.com.apex.aula01;

// Trouxe dados de outro pacote
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exemplo03 {
	
	public static void main(String[] args) {
		
		// Scanner - usuário informa dados
		
		// Scanner teclado = new Scanner(System.in);
		// System.out.println("Informe seu peso:");
		// double peso = Double.parseDouble(teclado.nextLine()); // fica aguardando a próxima digitação, enquanto não digitar, fica travado
		// System.out.println("Informe seu altura:");
		// double altura = Double.parseDouble(teclado.nextLine());
		
		
//		double imc = Exemplo02.calculaIMC(peso, altura);
//		System.out.println(imc);
//		if(imc < 18) {
//			System.out.println("Abaixo do peso");
//		} else if(imc >= 18 && imc <=23) {
//			System.out.println("Peso normal");
//		} else {
//			System.out.println("Acima do peso");
//		}
//		teclado.close(); // Fecha a conexão com o teclado, fica aguardando dados
//		
//	}
		
		
//		// Outro tipo de mensagem na tela
//		JOptionPane.showMessageDialog(null, "Olá, boa tarde");
//		
//		// Outra entrada de dados
//		String nome = JOptionPane.showInputDialog("Qual é o seu nome:");
//		
//		// Entrada de confirmação
//		JOptionPane.showConfirmDialog(null, "Tem certeza?");

		
		// Reescrevendo com o JOption
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu peso?"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua altura?"));
				
		double imc = Exemplo03.calculaIMC(peso, altura);
		
		
		if(imc < 18) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso\n" + imc);
		} else if(imc >= 18 && imc <=23) {
			JOptionPane.showMessageDialog(null, "Peso normal\n" + imc);
		} else {
			JOptionPane.showMessageDialog(null, "Acima do peso\n" + imc);
		}
	
	}

	
		public static double calculaIMC(double peso, double altura) {
			double imc = peso / (altura * altura);
			return imc;
			
		}

	}