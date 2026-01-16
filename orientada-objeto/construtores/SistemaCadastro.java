package construtores;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("123", "Marcos");
		
		marcos.setEndereco("Rua abc");
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}	
}
