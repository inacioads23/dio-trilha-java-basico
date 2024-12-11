import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) throws Exception{
		Scanner ler = new Scanner(System.in);
		SmartTv smart = new SmartTv();
		
		System.out.println("A tv está " + smart.ligada);
		System.out.println("Está no canal: " + smart.canal);
		System.out.println("Está no Volume: " + smart.volume);
		
		smart.desligarTv();
		System.out.println("A tv está " + smart.ligada + "\n");
		smart.aumentarCanal();
		smart.aumentarCanal();
		smart.aumentarCanal();
		System.out.println("Está no canal: " + smart.canal + "\n");
		
		smart.aumentarVolume();
		smart.aumentarVolume();
		smart.aumentarVolume();
		System.out.println("Está no volume: " + smart.volume);
		System.out.println("Está no canal: " + smart.canal);
		System.out.println("A tv está " + smart.ligada + "\n");
		
		
		System.out.print("Digite um canal: ");
		int novocanal = ler.nextInt();
		smart.digitarCanal(novocanal);
		System.out.println("Está no canal: " + smart.canal);
		System.out.println("Está no volume: " + smart.volume);
		System.out.println("A tv está " + smart.ligada + "\n");

		

	}

}
