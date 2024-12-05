import java.util.Date;

public class Operadores {
	public static void main(String[] args) {
		/*
		 * String nome = "INACIO"; int idade = 22; double peso = 68.5; char sexo = 'M';
		 * boolean doadorOrgao = false; Date dataNascimento = new Date(); // classe que
		 * representa um tipo.
		 * 
		 * double soma = 10.5 + 15.7; int subtracao = 113 - 25; int multiplicacao = 20 *
		 * 7; int modulo = 18 % 3; // resto da divisão por 3 double resultado = (10 * 7)
		 * + (20 / 4);
		 * 
		 * // O operador "+" quando em String tema função de concatenação String
		 * nomeCompleto = "LINGUAGEM" + "JAVA"; System.out.println(nomeCompleto);
		 * 
		 * String concatenacao = "?"; System.out.println(concatenacao);
		 * 
		 * // faz a soma e concatena 1 concatenacao = 1 + 1 + 1 + "1";
		 * System.out.println(concatenacao);
		 * 
		 * // depois de String não soma mais concatenacao = 1 + "1" + 1 + 1;
		 * System.out.println(concatenacao);
		 * 
		 * concatenacao = "1" + 1 + 1 + 1; System.out.println(concatenacao);
		 * 
		 * concatenacao = "1" + (1 + 1 + 1); System.out.println(concatenacao);
		 

		// Operadores unários
		int numero = 5;

		System.out.println(- numero); // o número fica negativo por causa do OPERADOR DE NEGAÇÃO. Mas isso não afetou a variável
		System.out.println(numero); // aqui é possível ver que o valor da variável não foi afetado

		// para haver uma mudança eu preciso atribuir um novo valor a variável
		numero = - numero; //torno o valor negativo
		System.out.println(numero); // agora o valor da variável foi afetado
		*/
		
		/*
		//Operadores de repetição 
		int numero = 5;
		
		//numero = numero + 1;
		numero++;
		System.out.println(numero);
		
		//numero = numero -1;
		numero--;
		System.out.println(numero);
		*/

		//Operador de negação com boolean
		boolean variavel = true;
		
		System.out.println(!variavel); //irá negar/ inverter o valor. Porém a o valor da variável não foi alterado
		System.out.println(variavel); //O valor da variável não foi alterado
		
		variavel = !variavel;		
		System.out.println(variavel); //Agora o valor da variável foi alterado
	}

}