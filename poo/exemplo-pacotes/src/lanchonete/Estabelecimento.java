package lanchonete;

import java.time.temporal.TemporalAmount;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estar disponíveis
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();		
		cozinheiro.selecionarIngredientesLanche();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		cozinheiro.prepararCombo();		
		//ações que o estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estar disponíveis
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();		
		//ações que somente o pacote cozinha precisa
		almoxarife.entregarIngredientes();
		almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servirMesa();
		//ação que somente o pacote cozinha precisa
		atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento ainda não definiu normas de atendiento
		cliente.pegarPedidoBalcao();
		
		//esta ação é muito sigilosa, que tal ser privada
		cliente.consultarSaldoAplicativo();
		
		//já pensou os clientes ouvindo que o gás acabou
		cozinheiro.pedirParaTrocarGas(atendente);
		cozinheiro.pedirIngredientes(almoxarife);
	}
}
