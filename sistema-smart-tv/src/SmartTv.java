public class SmartTv {

    boolean ligada = false;
    int volume = 20;
    int canal = 4;

    public void mudarCanal(int novoCanal){
      canal = novoCanal; 
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("diminuindo volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}