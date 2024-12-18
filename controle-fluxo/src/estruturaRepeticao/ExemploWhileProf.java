package estruturaRepeticao;

import java.util.concurrent.ThreadLocalRandom;

/*
 * While - enquanto uma condição for válida/ verdadeira, o bloco de código será executado
 * testa a condição antes de executar o código, caso seja falsa, o restante do bloco do código nem será executado
 * Precisa estar atento para que em algum momento a condição se torne falsa, senão entra em loop infinito
 * */
public class ExemploWhileProf {

	public static void main(String[] args) {
		double mesada = 50.00;

		while (mesada > 0) {
			Double valorDoce = valorAleatorio();
			if (valorDoce > mesada) {
				// força o valorDoce a ser igual a zero, para não aparecer valor negativo
				valorDoce = mesada;
			}
			System.out.printf("Doce valor: %.2f Adicionado no carrinho%n", valorDoce);
			mesada = mesada - valorDoce;
		}
		System.out.println("\nSaldo da Mesada: " + mesada);
		System.out.println("Joãozinho gastou toda a sua mesada m doces");

	}

	private static Double valorAleatorio() {
		// Método gera valores aleatórios entre 2 e 8
		return ThreadLocalRandom.current().nextDouble(2, 15);
	}

}
