package lanchonete.atendimento;

public class Atendente {
	void trocarGas() {
		System.out.println("Atendente trocando o gás. ");
	}
	
	public void receberPagamento() {
		System.out.println("Recebendo pagamento. ");
	}
	
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("Servindo Mesa. ");
	}
	
	private void pegarLancheCozinha() {
		System.out.println("Pegando lanche na cozinha. ");
	}
}
