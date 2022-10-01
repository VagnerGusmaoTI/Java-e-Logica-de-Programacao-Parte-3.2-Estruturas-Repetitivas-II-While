import java.util.Locale;

import java.util.Scanner;

public class beecrowd1118_VariasNotasComValidacao_while {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1118 V�rias Notas Com
		// Valida��o
		// Consecutivos
		// https://www.beecrowd.com.br/judge/pt/problems/view/1118
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe
		// para Main

		// Escreva um programa para ler as notas da primeira e a segunda avalia��o de um
		// aluno.
		// Calcule e imprima a m�dia semestral. O programa s� dever� aceitar notas
		// v�lidas (uma nota v�lida deve pertencer ao intervalo [0,10]).
		// Cada nota deve ser validada separadamente.

		// No final deve ser impressa a mensagem �novo calculo (1-sim 2-nao)�,
		// solicitando ao usu�rio que informe um c�digo (1 ou 2)
		// indicando se ele deseja ou n�o executar o algoritmo novamente, (aceitar
		// apenas os c�digo 1 ou 2).
		// Se for informado o c�digo 1 deve ser repetida a execu��o de todo o programa
		// para permitir um novo c�lculo,
		// caso contr�rio o programa deve ser encerrado.

		// Entrada
		// O arquivo de entrada cont�m v�rios valores reais, positivos ou negativos.
		// Quando forem lidas duas notas v�lidas, deve ser lido um valor inteiro X .
		// O programa deve parar quando o valor lido para este X for igual a 2.

		// Sa�da
		// Se uma nota inv�lida for lida, deve ser impressa a mensagem �nota invalida�.
		// Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem �media =
		// � seguido do valor do c�lculo.

		// Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim
		// 2-nao)"
		// e esta mensagem deve ser apresentada novamente se o valor da entrada padr�o
		// para X for menor do que 1 ou maior do que 2, conforme o exemplo abaixo.

		// A m�dia deve ser impressa com dois d�gitos ap�s o ponto decimal.

		// Exemplo de Entrada: -3.5 / Exemplo de Sa�da: nota invalida
		// Exemplo de Entrada: 3.5 / Exemplo de Sa�da: nota invalida
		// Exemplo de Entrada: 11.0 / Exemplo de Sa�da: media = 6.75
		// Exemplo de Entrada: 10.0 / Exemplo de Sa�da: novo calculo (1-sim 2-nao)
		// Exemplo de Entrada: 4 / Exemplo de Sa�da: novo calculo (1-sim 2-nao)
		// Exemplo de Entrada: 1 / Exemplo de Sa�da: media = 8.50
		// Exemplo de Entrada: 8.0 / Exemplo de Sa�da: novo calculo (1-sim 2-nao)
		// Exemplo de Entrada: 9.0 / Exemplo de Sa�da:
		// Exemplo de Entrada: 2 / Exemplo de Sa�da:

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int novoCalculo;
		double nota1, nota2, media;

		novoCalculo = 1;

		while (novoCalculo == 1) {
			nota1 = sc.nextDouble();
			while (nota1 < 0.0 || nota1 > 10.0) {
				System.out.println("nota invalida");
				nota1 = sc.nextDouble();
			}

			nota2 = sc.nextDouble();
			while (nota2 < 0.0 || nota2 > 10.0) {
				System.out.println("nota invalida");
				nota2 = sc.nextDouble();
			}

			media = (nota1 + nota2) / 2.0;

			System.out.printf("media = %.2f%n", media);

			System.out.println("novo calculo (1-sim 2-nao)");

			novoCalculo = sc.nextInt();

			while (novoCalculo != 1 && novoCalculo != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				novoCalculo = sc.nextInt();
			}
		}

		sc.close();

	}

}
