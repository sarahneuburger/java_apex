package exemplo06;

public class Loja {

	public static void main(String[] args) {
		
		// Variáveis
		double valor = 300;
		boolean aVista = true;
		
		// Condicional
		if(valor >= 200 && aVista == true) {
			System.out.println("R$" + valor * 0.9);
		} else {
			System.out.println("R$" + valor);
			
		}
		
		/*
		 Operadores Lógicos
		 
		 &  - E  (Executa todas as verificações)
		 && - E  (Se a primeira verificação retorna falso, ele não executa os demais)
		 || - Ou (Executa todas as verificações)
		 |  - Ou (O primeiro true encontrado, ele não executa as demais)
		 ^  - XOR (retorna verdade se houver uma verificação true e uma false)
		 
		 
		 
		 
		 */
	}

}
