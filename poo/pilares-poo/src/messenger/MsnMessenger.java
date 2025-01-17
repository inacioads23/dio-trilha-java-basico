package messenger;

public class MsnMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem Pelo MSN Messenger");		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem Pelo MSN Messenger");		
	}
	
}
