import java.util.Locale;

import java.util.Scanner;

public class beecrowd1117_ValidacaoDeNota_while {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1117 Quadrante
		// https://www.beecrowd.com.br/judge/pt/problems/view/1117
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe
		// para Main

		// Fa�a um programa que leia as notas referentes �s duas avalia��es de um aluno.
		// Calcule e imprima a m�dia semestral. Fa�a com que o algoritmo s� aceite notas
		// v�lidas (uma nota v�lida deve pertencer ao intervalo [0,10]).
		// Cada nota deve ser validada separadamente.

		// Entrada
		// A entrada cont�m v�rios valores reais, positivos ou negativos. O programa
		// deve ser encerrado quando forem lidas duas notas v�lidas.

		// Sa�da
		// Se uma nota inv�lida for lida, deve ser impressa a mensagem "nota invalida".
		// Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem "media =
		// " seguido do valor do c�lculo.
		// O valor deve ser apresentado com duas casas ap�s o ponto decimal.

		// Exemplo de Entrada: -3.5 / Exemplo de Sa�da: nota invalida
		// Exemplo de Entrada: 3.5 / Exemplo de Sa�da: nota invalida
		// Exemplo de Entrada: 11.0 / Exemplo de Sa�da: media = 6.75
		// Exemplo de Entrada: -7 1 / Exemplo de Sa�da: 

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double nota1, nota2, media;

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

		sc.close();

	}

}
