import java.util.Scanner;

public class beecrowd1114_SenhaFixa_while {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1114 Senha fixa
		// https://www.beecrowd.com.br/judge/pt/problems/view/1114
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe
		// para Main

		// Escreva um programa que repita a leitura de uma senha at� que ela seja
		// v�lida.
		// Para cada leitura de senha incorreta informada, escrever a mensagem "Senha
		// Invalida".
		// Quando a senha for informada corretamente deve ser impressa a mensagem
		// "Acesso Permitido" e o algoritmo encerrado.
		// Considere que a senha correta � o valor 2002.

		// Entrada
		// A entrada � composta por v�rios casos de testes contendo valores inteiros.

		// Sa�da
		// Para cada valor lido mostre a mensagem correspondente � descri��o do
		// problema.

		// Exemplo de Entrada: 2200 / Exemplo de Sa�da: Senha Invalida
		// Exemplo de Entrada: 1020 / Exemplo de Sa�da: Senha Invalida
		// Exemplo de Entrada: 2022 / Exemplo de Sa�da: Senha Invalida
		// Exemplo de Entrada: 2002 / Exemplo de Sa�da: Acesso Permitido

		Scanner sc = new Scanner(System.in);

		int senha;
		
		senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}

		System.out.println("Acesso Permitido");

		sc.close();

	}

}
