public class Usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

            System.out.println("Qual volumes está?: " + smartTv.volume);
           
            System.out.println("Canal SBT: " + smartTv.canal);

        smartTv.mudarCanal(5);

            System.out.println("Canal Globo: " + smartTv.canal);    
        
        

        smartTv.ligar();
            System.out.println("novo estado -> TV está ligada?: " + smartTv.ligada);

        smartTv.desligar();
            System.out.println("novo estado -> TV está ligada?: " + smartTv.ligada);
    }
}
