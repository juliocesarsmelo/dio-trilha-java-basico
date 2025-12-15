package edu.julio.fundamentos_plataforma;

public class Metodos {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV Ligada ? " + smartTv.ligada);

        smartTv.mudarCanal(25);
        System.out.println("Canal Atual ? " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual ? " + smartTv.volume);
    }
}
