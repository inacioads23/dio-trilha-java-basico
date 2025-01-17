package messenger;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		System.out.println("MSN");
		MsnMessenger msn = new MsnMessenger();		
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("\nFACEBOOK");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println("\nTELEGRAM");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();

	}

}
