package lanchoneteVisibilidade.atendimento;

public class Atendente {
	
	public void servirMesa() {
		pegarLancheCozinha();
		System.out.println("SERVINDO MESA");
	}
	
	private void pegarLancheCozinha() {
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}

	//default - visível apenas no pacote
	void trocarGas() {
		System.out.println("ATENDENTE TROCANDO O GÁS");
		
	}
	
	private void pegarPedidoBalcao() {
		System.out.println("PEGANDO PEDIDO NO BALCÃO");
		
	}

}
