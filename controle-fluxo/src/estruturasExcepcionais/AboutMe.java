package estruturasExcepcionais;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {

	public static void main(String[] args) {
		// os argumentos começam com o índice 0
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);

		try {
			System.out.print("Digite o seu nome: ");
			String nome = ler.next();

			System.out.print("Digite seu Sobrenome: ");
			String sobrenome = ler.next();

			System.out.print("Digite sua idade: ");
			int idade = ler.nextInt();

			System.out.print("Digite sua altura: ");
			double altura = ler.nextDouble();

			System.out.println("\nOlá, me chamo " + nome + " " + sobrenome);
			System.out.println("Tenho " + idade + " anos");
			System.out.println("Minha altura é " + altura + "cm");
			ler.close();
		} catch (InputMismatchException e) {
			System.out.println("Os campos altura e idade precisam ser numéricos");
		}
	}
}
