/*
 * Enum - Para valores pré-estabelecidos
 */
package enums;

public class SistemaIbge {

	public static void main(String[] args) {
		
		System.out.println("Todos os Estados");
		//foreach
		//Percorre todos os valores do Enum
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {			
			System.out.println(e.getSigla() + " - " + e.getNome());
		}
		
		EstadoBrasileiro eb = EstadoBrasileiro.CEARA;
		System.out.println("\nEstado Específco");
		System.out.println(eb.getNome());
		System.out.println(eb.getSigla());
		System.out.println(eb.getNomeMaiusculo());
		System.out.println(eb.getIbge());
	}

}
