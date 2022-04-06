public class Azione extends Thread{
    Salvadanaio salvadanaio;
    boolean inserisci;

    //constructor
    public Azione(Salvadanaio salvadanaio, boolean inserisci){
        this.salvadanaio = salvadanaio;
        this.inserisci = inserisci;
    }
    
    //-----------------------------------------

    public void run(){
        for(int i = 0; i < 1000; i++){
            if (inserisci) {
                salvadanaio.inserisci();
            }else{
                salvadanaio.preleva();
            }
        }
    }
}
