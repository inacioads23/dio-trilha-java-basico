package com.inacio.segundasemana;
public class MinhaClasse {

	public static void main(String[] args) {
		// classe, tp saída, impressão
		// System.out.println("Olá turma, sejam bem-vindos");
		String primeiroNome = "Jose";
		String segundoNome = "Inacio";
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); // variável recebe o resultado do método

		System.out.println(nomeCompleto);

	}

	// TipoRetorno NomeOjetivoNoInfinitivo Parametro(s)
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
	}
}
