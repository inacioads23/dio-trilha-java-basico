/*
 * Getter: retorna o valor do atributo especificado
 * Setter: define outro novo valor para o atributo especificado
 * */
package escolaGetSet;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno(); // Criando um novo objeto aluno, com nome felipe
		felipe.nome= "Felipe";
		felipe.idade= 8;
		
		System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos");
	}
}
