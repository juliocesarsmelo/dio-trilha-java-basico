package lanchonete.area.cliente;

public class Cliente {
	public void pagarConta() {
		consultarSaldoAplicativo();
		System.out.println("Pagando a conta. ");
	}
	
	private void consultarSaldoAplicativo() {
		System.out.println("Consultando saldo no app. ");
	}
}
