package pilarespoo;

public class Carro {
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro Ligado. ");
	}
	
	private void confereCambio() {
		System.out.println("Conferindo cambio. ");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combustivel");
	}
	
}
