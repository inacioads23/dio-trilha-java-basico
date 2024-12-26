package lanchonete.atendimento.cozinha;

public class Almoxarife {

	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAÍDA DOS ITENS");
	}
	
	//default - visível apenas no pacote
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}
	
	//default - visível apenas no pacote
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}

}
