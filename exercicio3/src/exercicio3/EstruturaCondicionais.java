package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Digite as duas notas de João");
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		
		double mediaFinal = (nota1 + nota2 + nota3) /2;
		
		System.out.printf("A nota final é = %.1f%n ", mediaFinal); 
		
		if (mediaFinal < 60.0) {
			System.out.println("Você está Reprovado, volte e repita as provas. ");
		}else {
			System.out.println("Parabéns você está Aprovado!!! Merece um rodizio de japa :D ");
		}
		
		
		
	sc.close();

	}

}
