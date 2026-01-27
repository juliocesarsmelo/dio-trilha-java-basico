package pilarespoo;

public class ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	public void salvarMensagem() {
		System.out.println("Salvando mensagem");
	}
	private void validarConectadoInternet() {
		System.out.println("validando conexão com internet");
	}
}
