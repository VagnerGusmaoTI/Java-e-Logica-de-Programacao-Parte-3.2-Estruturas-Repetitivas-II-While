import java.util.Scanner;

public class beecrowd1131_Grenais_while {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exercício da plataforma beecrowd, nível iniciante: 1131 Grenais
		// https://www.beecrowd.com.br/judge/pt/problems/view/1131
		// OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe
		// para Main

		// A Federação Gaúcha de Futebol contratou você para escrever um programa para
		// fazer uma estatística do resultado de vários GRENAIS.
		// Escreva um programa para ler o número de gols marcados pelo Inter e pelo
		// Grêmio em um GRENAL.
		// Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma
		// resposta.
		// Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o
		// número de gols marcados pelos times em uma nova partida,
		// caso contrário deve ser encerrado imprimindo:

		// - Quantos GRENAIS fizeram parte da estatística.
		// - O número de vitórias do Inter.
		// - O número de vitórias do Grêmio.
		// - O número de Empates.
		// - Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou
		// "Nao houve vencedor", caso termine empatado).

		// Entrada
		// O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols
		// marcados pelo Inter e pelo Grêmio respectivamente.
		// Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do
		// programa.

		// Saída
		// Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim
		// 2-nao)".
		// Quando o algoritmo for encerrado devem ser mostradas as estatísticas conforme
		// a descrição apresentada acima.
		// Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo
		// abaixo.

		// Exemplo de Entrada: 3 2 / Exemplo de Saída: Novo grenal (1-sim 2-nao)
		// Exemplo de Entrada: 1 / Exemplo de Saída: Novo grenal (1-sim 2-nao)
		// Exemplo de Entrada: 2 3 / Exemplo de Saída: Novo grenal (1-sim 2-nao)
		// Exemplo de Entrada: 1 / Exemplo de Saída: 3 grenais
		// Exemplo de Entrada: 3 1 / Exemplo de Saída: Inter:2
		// Exemplo de Entrada: 2 / Exemplo de Saída: Gremio:1 Empates:0 Inter venceu
		// mais

		Scanner sc = new Scanner(System.in);

		int vitoriasInter, vitoriasGremio, empates, novoGrenal, golsInter, golsGremio, total;

		vitoriasInter = 0;
		vitoriasGremio = 0;
		empates = 0;
		novoGrenal = 1;

		while (novoGrenal == 1) {
			golsInter = sc.nextInt();
			golsGremio = sc.nextInt();

			if (golsInter > golsGremio) {
				vitoriasInter = vitoriasInter + 1;
			} else if (golsGremio > golsInter) {
				vitoriasGremio = vitoriasGremio + 1;
			} else {
				empates = empates + 1;
			}

			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
		}

		total = vitoriasGremio + vitoriasInter + empates;

		System.out.println(total + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);

		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		} else if (vitoriasGremio > vitoriasInter) {
			System.out.println("Gremio venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}

		sc.close();

	}

}
