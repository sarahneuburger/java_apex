package exemplo11;

import javax.swing.JOptionPane;

public class Escolha {

	public static void main(String[] args) {

		// Realizar uma pergunta
		int pergunta = JOptionPane.showConfirmDialog(null, "Voc� est� gostando de Java?");
		
		// Retorno
		switch (pergunta) {
			case 0:
				JOptionPane.showMessageDialog(null, "Que bom!");
			break;
			
			case 1:
				JOptionPane.showMessageDialog(null, "Que pena!");
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "A��o cancelada.");
					
		}

	}

}
