package estruturaRepeticao;

/* Em Foreach a interação é baseada nos elementos da coleção. Indicado para Array
 * 
 * ARRAY - conjunto de elementos de um tipo (int, String, double) correspondente
 */

public class ExemploForEach {
	public static void main(String[] args) {
		// em arrays o índice de array inicia em ZERO
		String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
		//                         tamanho/ quantidade
		// Defino o elemento : E a cada interação o elemento vai recebendo um novo valor
		for (String aluno : alunos) {
			System.out.println("Nome do aluno: " + aluno);
		}
		System.out.println("\nLista finalizou");		
	}
}
