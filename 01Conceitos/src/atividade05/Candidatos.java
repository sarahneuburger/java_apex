package atividade05;

import javax.swing.JOptionPane;

public class Candidatos {

	public static void main(String[] args) {

		
		// Variáveis dos candidatos
		int candidato1 = 0;
		int candidato2 = 0;
		int candidato3 = 0;
		int candidato4 = 0;
		
		int candidatos = 0;
		
		int contador = 0;
		
		while (contador < 5) {
			// Tela de votação
			candidatos = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do candidato, sendo: \n 1 - Sarah \n 2 - Maria \n 3 - João \n 4 - Lucia" ));

			
			// Switch Case
			switch (candidatos) {
				case 1:
					candidato1++;
				break;
				
				case 2:
					candidato2++;
				break;
				
				case 3:
					candidato3++;
				break;
				
				case 4:
					candidato4++;
				break;
			}
			
			contador++;
			
		}
		
		System.out.println("A candidata Sarah recebeu " + candidato1 + " votos.");
		System.out.println("A candidata Maria recebeu " + candidato2 + " votos.");
		System.out.println("A candidata João recebeu " + candidato3 + " votos.");
		System.out.println("A candidata Lucia recebeu " + candidato4 + " votos.");
	}

}
