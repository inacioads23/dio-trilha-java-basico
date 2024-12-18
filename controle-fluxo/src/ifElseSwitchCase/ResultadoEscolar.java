package ifElseSwitchCase;

public class ResultadoEscolar {

	public static void main(String[] args) {
		int nota = 7;

		/*
		// Condicional Composta
		if (nota >= 7) {
			System.out.println("Aprovado");
		// Condicional encadeada
		} else if (nota >= 5) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}*/
		
		//Condição ternária
		String resultado = nota >= 7? "Aprovado" : "Reporovado";
		System.out.println(resultado);
		
		nota = 4;
		
		String resultado1 = nota >= 7? "Aprovado" : nota >= 5? "Recuperação" : "Reprovado";
		System.out.println(resultado1);
	}
}
