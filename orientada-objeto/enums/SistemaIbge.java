package enums;

public class SistemaIbge {
	public static void main(String[] args) {
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + "-" + e.getNome());
		}
		EstadoBrasileiro e = EstadoBrasileiro.SAO_PAULO;
		System.out.println(e.getSigla());
	}
}
