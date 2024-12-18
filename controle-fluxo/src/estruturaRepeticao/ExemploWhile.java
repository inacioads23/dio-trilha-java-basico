package estruturaRepeticao;

import java.util.concurrent.ThreadLocalRandom;

/*
 * While - enquanto uma condição for válida/ verdadeira, o bloco de código será executado
 * testa a condição antes de executar o código, caso seja falsa, o restante do bloco do código nem será executado
 * Precisa estar atento para que em algum momento a condição se torne falsa, senão entra em loop infinito
 * */
public class ExemploWhile {

	public static void main(String[] args) {
		double mesada = 50.00;
		Double valorDoce = null;

		while (valorDoce < mesada) {
			valorDoce = valorAleatorio();
			
			System.out.printf("Doce valor: %.2f Adicionado no carrinho%n", valorDoce);
			mesada = mesada - valorDoce;
		}
		System.out.println("\nSaldo da Mesada: " + mesada);
		System.out.println("Joãozinho gastou toda a sua mesada m doces");

	}

	private static Double valorAleatorio() {
		// Método gera valores aleatórios entre 2 e 15
		return ThreadLocalRandom.current().nextDouble(2, 15);
	}

}
