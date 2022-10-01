import java.util.Locale;

import java.util.Scanner;

public class beecrowd1154_Idades_while {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exercício da plataforma beecrowd, nível iniciante: 1154 Idades
		// https://www.beecrowd.com.br/judge/pt/problems/view/1154
		// OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe
		// para Main

		// Faça um algoritmo para ler um número indeterminado de dados, contendo cada
		// um, a idade de um indivíduo.
		// O último dado, que não entrará nos cálculos, contém o valor de idade
		// negativa.
		// Calcular e imprimir a idade média deste grupo de indivíduos.

		// Entrada
		// A entrada contém um número indeterminado de inteiros. A entrada será
		// encerrada quando um valor negativo for lido.

		// Saída
		// A saída contém um valor correspondente à média de idade dos indivíduos.

		// A média deve ser impressa com dois dígitos após o ponto decimal.

		// Exemplo de Entrada: 34 / Exemplo de Saída: 39.25
		// Exemplo de Entrada: 56 / Exemplo de Saída: 
		// Exemplo de Entrada: 44 / Exemplo de Saída: 
		// Exemplo de Entrada: 23 / Exemplo de Saída: 
		// Exemplo de Entrada: -2 / Exemplo de Saída:
		
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
