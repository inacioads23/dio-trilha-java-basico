package abstracao;

public class Autodromo {

	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("897897");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("467755");
		z400.ligar();

	}

}