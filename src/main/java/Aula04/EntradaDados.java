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
		
		//l� uma palavra
		//s1 = sc.next();
		
		//L� tudo que for digitado na linha
		//s1 = sc.nextLine();
		
		//Para ler s� um caractere 
		//s1. sc.next().char(posi��o do caracter que qro ver);)
		
	}

}
