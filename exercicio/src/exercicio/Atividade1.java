package exercicio;

import java.util.Locale;

public class Atividade1 {

	public static void main(String[] args) {
		
			
		String product = "Computer";
		int y = 32;
		double x = 10.35784;
		
		System.out.println(product);
		System.out.println(y);
		System.out.printf("%.3f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);  
	
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
				
	 	System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	 	
		// MARCADORES DE VARIÁVEIS -> %f = PONTO FLUTUANTE
	 	// MARCADORES DE VARIÁVEIS -> %d = INTEIRO
	 	// MARCADORES DE VARIÁVEIS -> %s = TEXTO
	 	// MARCADORES DE VARIÁVEIS -> %n = QUEBRA DE LINHA
	 	
	}

}
