package abstracao;

//Classe genérica e abstrata
public abstract class Veiculo {
	private String chassi;

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public abstract void ligar(); //As classes herdeiras serão obrigadas a implantar esse método

}
