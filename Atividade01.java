package atividadesJava.generation;

import java.util.Scanner;

public class Atividade01 { 

	public static void main(String[] args) {
		
			int a, m, d, dias;
			
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Escreva sua idade em anos: ");
	a = leia.nextInt();
	
	System.out.println("Escreva sua idade em meses: ");
	m = leia.nextInt();
	
	System.out.println("Escreva sua idade em dias: ");
	d = leia.nextInt();
	
	
	dias = ((a * 365) + (m * 30) + d);
	
	System.out.println("Sua idade em dias é: " + dias);
	
	
	leia.close();
	}

}


