package exemplo06;

public class Loja {

	public static void main(String[] args) {
		
		// Vari�veis
		double valor = 300;
		boolean aVista = true;
		
		// Condicional
		if(valor >= 200 && aVista == true) {
			System.out.println("R$" + valor * 0.9);
		} else {
			System.out.println("R$" + valor);
			
		}
		
		/*
		 Operadores L�gicos
		 
		 &  - E  (Executa todas as verifica��es)
		 && - E  (Se a primeira verifica��o retorna falso, ele n�o executa os demais)
		 || - Ou (Executa todas as verifica��es)
		 |  - Ou (O primeiro true encontrado, ele n�o executa as demais)
		 ^  - XOR (retorna verdade se houver uma verifica��o true e uma false)
		 
		 
		 
		 
		 */
	}

}
