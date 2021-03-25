package Aula07;

public class FuncoesString {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG";
	
		//Formatar : toLowerCase(), toUpperase(), trim()
		//modifica todas as letras da String para minusculas.
		String s01= original.toLowerCase();
		//modifica todas as letras da String para maiusculas.
		String s02= original.toUpperCase();
		//retira os espaços da string
		String s03= original.trim();
		
		//Recortar: substring(inicio), substring(inicio,fim)
		String s04= original.substring(2);	
		String s05= original.substring(2, 9);
		
		//Substituir: Replace(char, char), Replace(string, string)
		String s06= original.replace('a','x');
		
		//Buscar: indexOf, LastIndexOf
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		//str.Split("")
		
		String s = "potato apple lemon orange";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
		
		
		System.out.println("Original: - " + original + "-");
		System.out.println("toLowerCase: - " + s01 + "-");
		System.out.println("toUpperCase: - " + s02 + "-");
		System.out.println("trim: - " + s03 + "-");
		System.out.println("substring(2): - " + s04 + "-");
		System.out.println("substring(2,9): - " + s05 + "-");
		System.out.println("replace: - " + s06 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last Index of 'bc': " + j);
		
		
	
	}
	
	
}
