package P.O.T.A_Aula11032021;

/*
 * Considere o programa abaixo para encontrar o maior valor em um vetor de n�meros
inteiros. Escreva em Java uma solu��o recursiva objetivando a mesma solu��o.
 */
public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//itera��o
	public int maiorValor(int[] v, int tamanho){
		int maior = v[0];
		for (int i = 1; i < tamanho; i++) {
		if (maior < v[i]) {
		maior = v[i];
		}
		}
		return maior;
		}


}