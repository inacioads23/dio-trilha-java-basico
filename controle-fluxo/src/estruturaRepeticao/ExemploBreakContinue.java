package estruturaRepeticao;

public class ExemploBreakContinue {

	public static void main(String[] args) {
		// no break, o processo acontece até antes da condição
		// no caso abaixo o resultado será: 1, 2
		System.out.println("break");
		for (int numero = 1; numero <= 5; numero++) {
			if (numero == 3) {
				break;
			}
			System.out.println(numero);
		}
		
		// no continue o que estiver na condição é ignorado/ excluído
		// no caso abaixo o resultado será: 1, 2, 4, 5
		System.out.println("\ncontinue");
		for (int numero = 1; numero <= 5; numero++) {
			if (numero == 3) {
				continue;
			}
			System.out.println(numero);
		}
	}

}
