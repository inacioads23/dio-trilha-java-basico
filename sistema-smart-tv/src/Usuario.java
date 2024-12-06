
public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();

		System.out.println("TV está ligada? " + smartTv.ligada);
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);

		smartTv.ligar(); // usando o método para alterar o estado
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		System.out.println("\nNovo Status-> TV está ligada? " + smartTv.ligada);
		System.out.println("Volume atual: " + smartTv.volume);

		smartTv.desligar(); // usando o método para alterar o estado
		System.out.println("\nNovo Status-> TV está ligada? " + smartTv.ligada);
		
		System.out.println("\nCanal atual: " + smartTv.canal);
		smartTv.mudarCanal(13);
		System.out.println("Canal alterado: " + smartTv.canal);

	}

}
