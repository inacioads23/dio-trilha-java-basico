package messenger;

public abstract class ServicoMensagemInstantanea {
	/*
	public void enviarMensagem() {
		validarConectadoInternet(); //encapsulamento
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem(); //encapsulamento
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	*/
	
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico da mensagem");
	}
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
}
