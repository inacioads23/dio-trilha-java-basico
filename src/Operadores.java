import java.util.Date;

public class Operadores {
	public static void main(String[] args) {
		String nome = "INACIO";
		int idade = 22;
		double peso = 68.5;
		char sexo = 'M';
		boolean doadorOrgao = false;
		Date dataNascimento = new Date(); // classe que representa um tipo.

		double soma = 10.5 + 15.7;
		int subtracao = 113 - 25;
		int multiplicacao = 20 * 7;
		int modulo = 18 % 3; // resto da divisão por 3
		double resultado = (10 * 7) + (20 / 4);

		// O operador "+" quando em String tema função de concatenação
		String nomeCompleto = "LINGUAGEM" + "JAVA";
		System.out.println(nomeCompleto);

		String concatenacao = "?";
		System.out.println(concatenacao);

		// faz a soma e concatena 1
		concatenacao = 1 + 1 + 1 + "1";
		System.out.println(concatenacao);

		// depois de String não soma mais
		concatenacao = 1 + "1" + 1 + 1;
		System.out.println(concatenacao);

		concatenacao = "1" + 1 + 1 + 1;
		System.out.println(concatenacao);

		concatenacao = "1" + (1 + 1 + 1);
		System.out.println(concatenacao);
		
		

	}

}