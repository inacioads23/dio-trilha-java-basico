import java.util.Date;

public class Operadores {
	public static void main(String[] args) {
		/*
		 * String nome = "INACIO";
		 * int idade = 22;
		 * double peso = 68.5;
		 * char sexo = 'M';
		 * boolean doadorOrgao = false;
		 * Date dataNascimento = new Date(); // classe que representa um tipo.
		 * 
		 * double soma = 10.5 + 15.7;
		 * int subtracao = 113 - 25;
		 * int multiplicacao = 20 * 7;
		 * int modulo = 18 % 3; // resto da divisão por 3
		 * double resultado = (10 * 7) + (20 / 4);
		 * 
		 * // O operador "+" quando em String tema função de concatenação String
		 * nomeCompleto = "LINGUAGEM" + "JAVA";
		 * System.out.println(nomeCompleto);
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
		 * 
		 * 
		 * // OPERADORES UNÁRIOS
		 * int numero = 5;
		 * 
		 * System.out.println(- numero); // o número fica negativo por causa do OPERADOR DE NEGAÇÃO. Mas isso não afetou a variável
		 * System.out.println(numero); // aqui é possível ver que o valor da variável não foi afetado
		 * 
		 * // para haver uma mudança eu preciso atribuir um novo valor a variável
		 * numero = - numero; //torno o valor negativo System.out.println(numero); // agora o
		 * valor da variável foi afetado
		 */

		/*
		 * //OPERADORES DE REPETIÇÃO
		 * int numero = 5;
		 * 
		 * //numero = numero + 1;
		 * numero++;
		 * System.out.println(numero);
		 * 
		 * //numero = numero -1;
		 * numero--;
		 * System.out.println(numero);
		 */

		/*
		 * //OPERADOR DE NEGAÇÃO com boolean
		 * boolean variavel = true;
		 * 
		 * System.out.println(!variavel); //irá negar/ inverter o valor. Porém a o valor da variável não foi alterado
		 * System.out.println(variavel); //O valor da variável não foi alterado
		 * 
		 * variavel = !variavel;
		 * System.out.println(variavel); //Agora o valor da variável foi alterado
		 */

		/*
		// OPERADOR TERNÁRIO
		int a, b;
		String resultado;
		a = 5;
		b = 6;

		// Usando if/ else
		if (a == b) {
			resultado = "verdadeiro";
		} else {
			resultado = "falso";
		}
		
		System.out.println(resultado);

		// Com operador Ternário
		resultado = (a == b) ? "verdadeiro" : "false";
		System.out.println(resultado);
		
		resultado = (a == b) ? "1" : "0";
		System.out.println(resultado);
		*/
		
		//OPERADORES RELACIONAIS
		String nomeUm = "INACIO";
		String nomeDois = "INACIO";
		String nomeTres = new String("INACIO");
		
			
		System.out.println(nomeUm == nomeDois);
		System.out.println(nomeUm == nomeTres);
		System.out.println(nomeUm.equals(nomeTres)); //para comparação de texto usar ".equals"
		
		
		int numero1 = 1;
		int numero2 = 2;
		
		if(numero1 > numero2) {
			System.out.println("Número 1 maior que numero 2");
		}else if(numero1 < numero2) {
			System.out.println("Número 1 menor que numero 2");
		}
				
			  		   //numero1 é igual a numero2?
		boolean simNao = numero1 == numero2;
		System.out.println("numeroUm é igual a numeroDois? " + simNao);
		
			   //numero1 é diferente do numero2?
		simNao = numero1 != numero2;
		System.out.println("numeroUm é diferente de numeroDois? " + simNao);
		
			   //numero1 é maior que o numero2?
		simNao = numero1 > numero2;
		System.out.println("numeroUm é maior que o numeroDois? " + simNao);
		
			   //numero1 é menor que o numero2?
		simNao = numero1 < numero2;
		System.out.println("numeroUm é menor que o numeroDois? " + simNao);

	}

}