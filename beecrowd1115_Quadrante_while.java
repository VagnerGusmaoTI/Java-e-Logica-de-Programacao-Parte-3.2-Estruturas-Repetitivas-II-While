import java.util.Scanner;

public class beecrowd1115_Quadrante_while {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1115 Quadrante
		// https://www.beecrowd.com.br/judge/pt/problems/view/1115
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe
		// para Main

		// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		// indeterminada de pontos no sistema cartesiano.
		// Para cada ponto escrever o quadrante a que ele pertence. O algoritmo ser�
		// encerrado quando pelo menos uma de duas coordenadas for NULA
		// (nesta situa��o sem escrever mensagem alguma).

		// Entrada
		// A entrada cont�m v�rios casos de teste. Cada caso de teste cont�m 2 valores
		// inteiros.

		// Sa�da
		// Para cada caso de teste mostre em qual quadrante do sistema cartesiano se
		// encontra a coordenada lida, conforme o exemplo.

		// Exemplo de Entrada: 2 2 / Exemplo de Sa�da: primeiro
		// Exemplo de Entrada: 3 -2 / Exemplo de Sa�da: quarto
		// Exemplo de Entrada: -8 -1 / Exemplo de Sa�da: terceiro
		// Exemplo de Entrada: -7 1 / Exemplo de Sa�da: segundo
		// Exemplo de Entrada: 0 2 / Exemplo de Sa�da: 
		
		Scanner sc = new Scanner(System.in);

		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
