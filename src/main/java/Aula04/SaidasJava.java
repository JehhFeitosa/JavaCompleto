package Aula04;

import java.util.Locale;

public class SaidasJava {

	public static void main(String[] args) {
		double x = 10.35784;
		System.out.printf("%.2f/n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		//%f = ponto flutuante
		//%d = inteiro
		//%s = texto
		//%n = quebra de linha
		
		String nome = "Samara";
		int idade = 11;
		double renda = 1160.00;
		System.out.printf("%s tem %d anos e recebe R$ %2f reais de pensão alimenticia %n", nome, idade, renda);
		
		/*
		 * int y = 32; System.out.println("Olá Mundo"); System.out.println(y);
		 */
	}

}
