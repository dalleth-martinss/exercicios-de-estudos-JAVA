package exercicio;

import java.util.Locale;

public class AtividadeFixacao {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		String product1 = "Computer";
		String product2 ="Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'f';
		
		double price1 = 2100.0;
		double prince2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, o preço dele é : R$ %.2f reais %n",  product1, price1);
		System.out.printf("%s, o preço dele é : R$ %.2f reais %n", product2, prince2);
		
		System.out.printf("Record: %d anos, codigo %d e gênero %s %n ", age, code, gender);
		
		System.out.printf("Mensurar com 8 casas decimais : %.8f %n", measure);
		System.out.printf("Rouded (three decimal places): %.3f %n ", measure );
		System.out.printf("US decimial point: %.3f %n", measure);
	}

}
        //MARCADORES DE VARIAVÉIS -> %f = PONTO FLUTUANTE
	 	// MARCADORES DE VARIAVEIS -> %d = INTEIRO
	 	// MARCADORES DE VARIAVEIS -> %s = TEXTO
	 	// MARCADORES DE VARIAVEIS -> %n = QUEBRA DE LINHA





