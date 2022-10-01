
import java.util.Scanner;

public class beecrowd1134_TipoDeCombustivel_while {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exerc�cio da plataforma beecrowd, n�vel iniciante: 1134 Tipo de combust�vel
		// https://www.beecrowd.com.br/judge/pt/problems/view/1134
		// OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe
		// para Main

		// Um Posto de combust�veis deseja determinar qual de seus produtos tem a
		// prefer�ncia de seus clientes.
		// Escreva um algoritmo para ler o tipo de combust�vel abastecido (codificado da
		// seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 4.Fim).
		// Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser
		// solicitado um novo c�digo (at� que seja v�lido).
		// O programa ser� encerrado quando o c�digo informado for o n�mero 4.

		// Entrada
		// A entrada cont�m apenas valores inteiros e positivos.

		// Sa�da
		// Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
		// abasteceram cada tipo de combust�vel, conforme exemplo.

		// Exemplo de Entrada: 8 / Exemplo de Sa�da: MUITO OBRIGADO
		// Exemplo de Entrada: 1 / Exemplo de Sa�da: Alcool: 1
		// Exemplo de Entrada: 7 / Exemplo de Sa�da: Gasolina: 2
		// Exemplo de Entrada: 2 / Exemplo de Sa�da: Diesel: 0
		// Exemplo de Entrada: 2 / Exemplo de Sa�da:
		// Exemplo de Entrada: 4 / Exemplo de Sa�da:

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
