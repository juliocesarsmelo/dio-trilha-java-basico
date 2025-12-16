package edu.julio.fundamentos_plataforma;
import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) throws Exception{
        System.out.println("Executado pelo terminal.");
        System.out.println("Executado pelo terminal, atualizado!!!");
        
        //Para compilar 
        // 
        //javac -d bin src/edu/julio/fundamentos_plataforma/MinhaClasse.java

        //Para executar 
        //
        //java -cp bin edu.julio.fundamentos_plataforma.MinhaClasse

        //Para utilizar parametros pelo debug
        String nome = args[0];
        System.out.println("Olá, me chamo " + nome);

        //Para receber parametros e entradas pelo Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Sua altura é -> " + altura);

        System.out.println("Digite seu nome: ");
        String nomeScanner = scanner.next();

        System.out.println("Seu nome é -> " + nomeScanner);

        scanner.close();
    }
}
