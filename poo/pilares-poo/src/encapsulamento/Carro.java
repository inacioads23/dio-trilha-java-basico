package encapsulamento;

public class Carro {
	private String chassi;
	
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public void ligar() {
		//Encapsulando - início
		confereCombustivel();
		confereCambio();
		//Encapsulando - fim
		System.out.println("CARRO LIGADO");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combustível");
	}
	
	private void confereCambio() {
		System.out.println("Conferindo se cambio está em P");
	}
}
