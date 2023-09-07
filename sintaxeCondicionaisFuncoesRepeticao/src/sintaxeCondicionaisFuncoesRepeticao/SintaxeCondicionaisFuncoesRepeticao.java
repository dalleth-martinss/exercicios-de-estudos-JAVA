package sintaxeCondicionaisFuncoesRepeticao;

import java.util.Scanner;

public class SintaxeCondicionaisFuncoesRepeticao {

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
			
			int higher = max(a, b, c);
			showResult(higher);
		}	
			
			sc.close();
	}
	// esta funcao recebe 3 valores e retorna o maior deles
	public static int max(int x, int y, int z) {
		int aux;//iniciada sem atribuir valor
		
		//condição testa se x for maior que y = true e x maior z = true vai retornar o valor de x
		if(x > y && x > z) {  
			aux = x;
		} else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	// esta função recebe um valor e imprime na tela concatenado, mas não retorna nada, pois é do tipo vazia.
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}


