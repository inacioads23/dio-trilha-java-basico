import java.util.Scanner;
import java.util.Locale;

public class AboutMe {

	public static void main(String[] args) {
		// os argumentos começam com o índice 0
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		/*
		String nome = args [0];
		String sobrenome = args [1];
		int idade = Integer.valueOf(args[2]);
		double altura = Double.valueOf(args[3]);
		*/
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
	}
}
