package exercicio;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é seu nome? ");
		String x;
		x = sc.next();
		//System.out.println(x); Se ativar, vai ficar repetido.
		
	
		System.out.println("Qual é a sua idade? ");
		int y;
		y = sc.nextInt();
		//System.out.println(y);
		
		System.out.println("Digite uma letra; ");
		char t;
		t = sc.next().charAt(0);
		System.out.println("CONTINUE.............");
		
		System.out.println("SAUDAÇÕES A SEREM DIGITADAS:");
		
		System.out.println("DIGITE OUTRO NUMERO: ");
		int i;
		String  s1, s2, s3;
		
		i = sc.nextInt();
		sc.nextLine();  // essa está vazia para corrigir o buff de leitura, pois ao dar o enter ele consome a proxima linha com dos dadoss
		System.out.println("DIGITE AS SAUDAÇÕES MANHÃ: ");
		s1 = sc.nextLine();
		System.out.println("DIGITE AS SAUDAÇÕES DA TARDE: ");
		s2 = sc.nextLine();
		System.out.println("DIGITE AS SAUDAÇÕES DA NOITE: ");
		s3 = sc.nextLine();
		System.out.println("==============FIM===============");
		
		
		
		
		
		sc.close();

	}

}
