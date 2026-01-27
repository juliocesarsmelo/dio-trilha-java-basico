package pilarespoo;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		
		FacebookMessenger face = new FacebookMessenger();
		face.enviarMensagem();
		
		Telegram tele = new Telegram();
		tele.enviarMensagem();
	}
}