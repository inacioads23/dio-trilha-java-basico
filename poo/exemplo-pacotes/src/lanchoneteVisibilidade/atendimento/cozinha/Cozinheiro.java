package lanchoneteVisibilidade.atendimento.cozinha;

public class Cozinheiro {
	//pode ser default - visível apaenas no pacote
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONADO LANCHE NATURAL HAMBURGUER NO BALCAO");
	}
	
	//pode ser default - visível apaenas no pacote
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONADO SUCO NO BALCAO");
	}
	
	//pode ser default - visível apaenas no pacote
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
	}
	
	private void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}
	
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONANDO O PÃO, SALADA,");
	}
	
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
	}
	
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
	}
	
	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER");
	}		
	
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}	
	
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
