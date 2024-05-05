public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Tv desligada? " + smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.mudarCanal(25);
        System.out.println("Novo canal: " + smartTv.canal);
    }
}
