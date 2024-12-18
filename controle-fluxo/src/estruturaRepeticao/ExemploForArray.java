package estruturaRepeticao;

/*
 * for (bloco de inicialização; expressão boleana de validação; bloco de incrementação)
 * {
 * comando que será executado até que a expressão de validação torne-se falsa
 * }
 * 
 * ARRAY - conjunto de elementos de um tipo (int, String, double) correspondente
 */

public class ExemploForArray {
	public static void main(String[] args) {
		// em arrays o índice de array inicia em ZERO
		String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
		//                         tamanho/ quantidade
		for (int x = 0; x < alunos.length; x++) {
			System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
		}
		System.out.println("\nLista finalizou");		
	}
}
