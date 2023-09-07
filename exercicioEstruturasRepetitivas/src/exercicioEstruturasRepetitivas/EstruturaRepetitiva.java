package exercicioEstruturasRepetitivas;

import java.util.Scanner;

public class EstruturaRepetitiva {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		while (true) {
			System.out.println("Digite 3 numeros, ou digite 0 para sair ");
			
			int a = sc.nextInt(); // a variavel "a" foi adicionado uma conição para quebrar o loop.
			if(a==0) {
			System.out.println("Paramos por aqui! :) ");
			break; // isso vai parar o loop.
			}
			
			int b = sc.nextInt(); 
			int c = sc.nextInt();
					
			
			if (a > b && a > c) {
				System.out.println("A conta do JAPA é sua :D ");
			 } 
			else if (b > a && b > c) {
				System.out.println("A conta do JAPA é minha :( ");
			 } 
			else if (c > a && c > b) {
				System.out.println("A conta vai ser divida meio a meio! ^^ ");
			}
			else {
				System.out.println( "Digite numeros diferentes: ");
			}
		
	}	
		
		sc.close();
		
	}

}
