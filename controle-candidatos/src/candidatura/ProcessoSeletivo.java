package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };
		for (String candidato : candidatos) {
			entrarEmContato(candidato); // utilizando o método
		}

		// imprimirSelecionados();
		// selecaoCandidatos();
		// analisarCandidato(1900.0);
		// analisarCandidato(2200.0);
		// analisarCandidato(2000.0);
	}

	static void entrarEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;

		do {
			atendeu = atender(); // utilizando o método
			continuarTentando = !atendeu;
			
			if(continuarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("Contato realizado com sucesso");
			}

		} while (continuarTentando && tentativasRealizadas < 3);

		if (atendeu) {
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa");
		} else {
			System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativasRealizadas);
		}
	}

	static boolean atender() {
		// se o número gerado de 1 a 3, for igual a 1, ATENDEU
		return new Random().nextInt(3) == 1;
	}

	static void imprimirSelecionados() {
		String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };

		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato nº " + (indice + 1) + " é " + candidatos[indice]);
		}

		System.out.println("\nForma abreviada de interação - for each");
		// variável temporária: Array
		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}

	static void selecaoCandidatos() {
		// Array com a lista de candidatos
		String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA",
				"DANIELA", "JORGE" };
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;

		// enquanto candidatosSelecionados for menor 5
		// e candidatoAtual for menor que a quantidade de candidatos
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();

			System.out.printf("O candidato %s solicitou este valor de salário R$ %.2f%n", candidato, salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}

	// Método para gerar números aleatórios
	static double valorPretendido() {
		// valores double gerados entre 1800 e 2200
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		} else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}
}
