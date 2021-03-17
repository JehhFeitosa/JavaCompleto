package Aula04;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		System.out.println("Voce digitou: " +x);
		
		sc.close();
		
		//lê uma palavra
		//s1 = sc.next();
		
		//Lê tudo que for digitado na linha
		//s1 = sc.nextLine();
		
		//Para ler só um caractere 
		//s1. sc.next().char(posição do caracter que qro ver);)
		
	}

}
