package br.com.apex.aula01;

public class Exemplo02 {
	
	public static void main(String[] args) {
		
		/* System.out.println(Exemplo02.calculaImposto(100, 15)); */
		
		double imc = Exemplo02.calculaIMC(76, 1.72);
		System.out.println(imc);
		if(imc < 18) {
			System.out.println("Abaixo do peso");
		} else if(imc >= 18 && imc <=23) {
			System.out.println("Peso normal");
		} else {
			System.out.println("Acima do peso");
		}
		
	}


		public static double calculaImposto(double valor, double percentual) {
			double totalImposto = valor - (valor * percentual / 100);
			return totalImposto;
			
		}
		
		
		public static double calculaIMC(double peso, double altura) {
			double imc = peso / (altura * altura);
			return imc;
			
		}

	}

