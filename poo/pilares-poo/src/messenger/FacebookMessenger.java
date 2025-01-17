package messenger;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem Pelo Facebook Messenger");		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem Pelo Facebook Messenger");		
	}
	
}
