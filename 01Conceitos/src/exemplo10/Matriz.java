package exemplo10;

public class Matriz {
	
	public static void main(String[] args) {
		
		// Matriz - somente um tipo de dado - definir nº de linhas e colunas
		String[][] dados = new String[3][2];
		
		// Adicionando dados
		dados[0][0] = "Julio"; // primeira linha e primeira coluna
		dados[0][1] = "22";	// primeira linha e segunda coluna
		dados[1][0] = "Larissa"; 
		dados[1][1] = "33";	
		dados[2][0] = "Cleber";
		dados[2][1] = "15";	
		
		// Listar dados
		// Linha
		for(int linha = 0; linha<dados.length; linha++) {
			
			// Coluna
			for (int coluna= 0; coluna<dados[0].length; coluna++) {
				
				// Exibir dados
				System.out.print(dados[linha][coluna]);
				
				// Se coluna for igual a zero, adiciona o hífen
				if(coluna == 0) {
					System.out.print(" - ");
				}								
			}
			
			// Quebra de linha
			System.out.println();
		}		
	}
}
