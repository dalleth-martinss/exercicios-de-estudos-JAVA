package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do circulo:");
		double R, A, pi = 3.14159;
		
		R = sc.nextDouble();
		A = pi * R * R;
		
		System.out.printf("A = %.4f%n ", A);
		
		sc.close();
		
		

	}

}
