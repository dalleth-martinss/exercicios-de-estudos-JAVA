package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeJava1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a largura do seu terreno: ");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento do seu terreno: ");
		double comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura* comprimento;
		
		double preco = area * metroQuadrado;
		
		System.out.printf("A ÁREA É = %.2f%n ", area, " Metros Quadrados ");
		System.out.printf("O PREÇO É = %.2f reais %n ", preco);
		
		
		
		
		
		
		sc.close();
		
	}

}
