import java.util.Locale;

import java.util.Scanner;

public class beecrowd1154_Idades_while {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1154 Idades
		// https://www.beecrowd.com.br/judge/pt/problems/view/1154
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe
		// para Main

		// Fa�a um algoritmo para ler um n�mero indeterminado de dados, contendo cada
		// um, a idade de um indiv�duo.
		// O �ltimo dado, que n�o entrar� nos c�lculos, cont�m o valor de idade
		// negativa.
		// Calcular e imprimir a idade m�dia deste grupo de indiv�duos.

		// Entrada
		// A entrada cont�m um n�mero indeterminado de inteiros. A entrada ser�
		// encerrada quando um valor negativo for lido.

		// Sa�da
		// A sa�da cont�m um valor correspondente � m�dia de idade dos indiv�duos.

		// A m�dia deve ser impressa com dois d�gitos ap�s o ponto decimal.

		// Exemplo de Entrada: 34 / Exemplo de Sa�da: 39.25
		// Exemplo de Entrada: 56 / Exemplo de Sa�da: 
		// Exemplo de Entrada: 44 / Exemplo de Sa�da: 
		// Exemplo de Entrada: 23 / Exemplo de Sa�da: 
		// Exemplo de Entrada: -2 / Exemplo de Sa�da:
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int idade, cont;
		double media, soma;
		
		idade = sc.nextInt();
		soma = 0;
		cont = 0;
		
		while (idade >= 0) {
			soma = soma + idade;
			cont = cont + 1;
			idade = sc.nextInt();
		}
		
		media = soma / cont;
		
		System.out.printf("%.2f%n", media);
		
		sc.close();
		

	}

}
