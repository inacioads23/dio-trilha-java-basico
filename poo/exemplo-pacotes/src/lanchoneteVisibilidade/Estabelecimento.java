package lanchoneteVisibilidade;

import lanchoneteVisibilidade.area.cliente.Cliente;
import lanchoneteVisibilidade.atendimento.Atendente;
import lanchoneteVisibilidade.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();

		// ações que o estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		Atendente atendente = new Atendente();
		atendente.servirMesa();
		atendente.receberPagamento();

		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
	}
}
