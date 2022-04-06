public class Salvadanaio {
    private int monete = 0;

    //get
    public int getMonete(){
        return monete;
    }

    //-----------------------------

    public void inserisci(){
        usando(true);
    }

    public void preleva(){
        usando(false);
    }

    private synchronized void usando(boolean azione){
        if (azione) {
            monete++;
        }else{
            monete--;
        }
    }

}
