public class Main {
    public static void main(String[] args) throws Exception {
        Salvadanaio s = new Salvadanaio();

        Azione inserisciMonete = new Azione(s, true);

        Azione prelevaMonete = new Azione(s, false);


        inserisciMonete.run();
        prelevaMonete.run();
        System.out.println("I threads sono partiti");

        inserisciMonete.join();

        System.out.println("I threads hanno finito");
        System.out.println(s.getMonete());

    }
}
