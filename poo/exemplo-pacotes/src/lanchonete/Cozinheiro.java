package lanchonete;

public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONADO LANCHE NATURAL NO BALCAO");
	}
	
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONADO SUCO NO BALCAO");
	}
	
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	public void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
	}
	
	public void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}
	
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	public void selecionarIngredientesLanche() {
		System.out.println("SELECIONANDO O PÃO, SALADA,");
	}
	
	public void selecionarIngredientesVitamina() {
		System.out.println("SELECIONANDO FRUTA, LEITA,");
	}
	
	public void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	
	public void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
	}
	
	public void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA");
	}
	
	public void pedirParaTrocarGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	public void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
