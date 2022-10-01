import java.util.Scanner;

public class beecrowd1113_CrescenteEDecrescente {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1113 Crescente e
		// decrescente
		// https://www.beecrowd.com.br/judge/pt/problems/view/1113
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe
		// para Main

		// Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
		// Escreva para cada X e Y uma mensagem que indique se estes valores foram
		// digitados em ordem crescente ou decrescente.

		// Entrada
		// A entrada cont�m v�rios casos de teste. Cada caso cont�m dois valores
		// inteiros X e Y.
		// A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

		// Sa�da
		// Para cada caso de teste imprima �Crescente�, caso os valores tenham sido
		// digitados na ordem crescente,
		// caso contr�rio imprima a mensagem �Decrescente�.

		// Exemplo de Entrada:/ Exemplo de Sa�da:
		// 5 4 Decrescente
		// 7 2 Decrescente
		// 3 8 Crescente
		// 2 2

		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			if (x < y) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();

	}

}
