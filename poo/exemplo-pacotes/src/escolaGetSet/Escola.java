/*
 * Getter: retorna o valor do atributo especificado
 * Setter: define outro novo valor para o atributo especificado
 * */
package escolaGetSet;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno(); // Criando um novo objeto aluno, com nome felipe
		/*
		 // USANDO O PADRÃO NORMAL
		 // Atribui um novo valor
		 felipe.nome= "Felipe";
		 felipe.idade= 8;
		  
		 // retorna o valor
		 System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos");
		 */

		// USANDO GET E SET
		// Atribui um novo valor
		felipe.setNome("Felipe Jose");
		felipe.setIdade(17);
		felipe.setSexo("O");

		// retorna o valor
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos" + " e é do sexo " + felipe.getSexo());
	}
}
