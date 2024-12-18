package estruturaRepeticao;

/*
 * for (bloco de inicialização; expressão boleana de validação; bloco de incrementação)
 * {
 * comando que será executado até que a expressão de validação torne-se falsa
 * }
 * */

public class ExemploFor {
	public static void main(String[] args) {
		// crescente
		for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
			System.out.println("Já foi " + (carneirinhos));
		}
		System.out.println("\nJãozinho Dormiu\n");

		// decrescente
		for (int carneirinhos = 20; carneirinhos > 0; carneirinhos--) {
			System.out.println("falta(m) " + (carneirinhos));
		}
		System.out.println("\nJãozinho Dormiu\n");
	}

}
