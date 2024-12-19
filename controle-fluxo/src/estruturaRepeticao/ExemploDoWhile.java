package estruturaRepeticao;
import java.util.Random;

public class ExemploDoWhile {

	public static void main(String[] args) {
		System.out.println("Discando...");

		do {
			System.out.println("Telefone tocando");
		} while (tocando());

		System.out.println("Alô!!!");
	}

	// O random sorteará números, se o número soteado for 1 ele muda o estado para (true), e atendeu inverte
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3) == 1;
		System.out.println("Atendeu? " + atendeu);

		return !atendeu;
	}
}
