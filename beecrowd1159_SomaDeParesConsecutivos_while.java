import java.util.Scanner;

public class beecrowd1159_SomaDeParesConsecutivos_while {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1159 Soma de Pares
		// Consecutivos
		// https://www.beecrowd.com.br/judge/pt/problems/view/1159
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe
		// para Main

		// O programa deve ler um valor inteiro X indefinidas vezes.
		// (O programa ir� parar quando o valor de X for igual a 0). Para cada X lido,
		// imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X , se for
		// par.
		// Se o valor de entrada for 4, por exemplo, a sa�da deve ser 40, que � o
		// resultado da opera��o: 4+6+8+10+12,
		// enquanto que se o valor de entrada for 11, por exempo, a sa�da deve ser 80,
		// que � a soma de 12+14+16+18+20.

		// Entrada
		// O arquivo de entrada cont�m muitos valores inteiros. O �ltimo valor do
		// arquivo � zero.

		// Sa�da
		// Imprima a saida conforme a explica��o acima e o exemplo abaixo.

		// Exemplo de Entrada: 4 / Exemplo de Sa�da: 40
		// Exemplo de Entrada: 11 / Exemplo de Sa�da: 80
		// Exemplo de Entrada: 0 / Exemplo de Sa�da:

		Scanner sc = new Scanner(System.in);
		
		int x, soma;

		x = sc.nextInt();

		while (x != 0) {

			// se for impar, some mais 1
			if (x % 2 != 0) {
				x = x + 1;
			}

			// expressao simplificada: 5 * x + 20
			soma = x + x + 2 + x + 4 + x + 6 + x + 8;
			
			System.out.println(soma);

			x = sc.nextInt();
		}

		sc.close();

	}

}
