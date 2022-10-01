
import java.util.Scanner;

public class beecrowd1134_TipoDeCombustivel_while {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exercício da plataforma beecrowd, nível iniciante: 1134 Tipo de combustível
		// https://www.beecrowd.com.br/judge/pt/problems/view/1134
		// OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe
		// para Main

		// Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		// preferência de seus clientes.
		// Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da
		// seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
		// Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser
		// solicitado um novo código (até que seja válido).
		// O programa será encerrado quando o código informado for o número 4.

		// Entrada
		// A entrada contém apenas valores inteiros e positivos.

		// Saída
		// Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
		// abasteceram cada tipo de combustível, conforme exemplo.

		// Exemplo de Entrada: 8 / Exemplo de Saída: MUITO OBRIGADO
		// Exemplo de Entrada: 1 / Exemplo de Saída: Alcool: 1
		// Exemplo de Entrada: 7 / Exemplo de Saída: Gasolina: 2
		// Exemplo de Entrada: 2 / Exemplo de Saída: Diesel: 0
		// Exemplo de Entrada: 2 / Exemplo de Saída:
		// Exemplo de Entrada: 4 / Exemplo de Saída:

		Scanner sc = new Scanner(System.in);

		int alcool, gasolina, diesel, tipo;

		alcool = 0;
		gasolina = 0;
		diesel = 0;

		tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
			} else if (tipo == 3) {
				diesel = diesel + 1;
			}

			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}
