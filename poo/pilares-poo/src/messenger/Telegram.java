package messenger;

public class Telegram extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem Pelo Telegram");		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem Pelo Telegram");		
	}
	
}
