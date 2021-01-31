package Strategy_EntenSimu_Ue;

public class Rotkopfente extends Ente {
    public Rotkopfente(String n) {
        super(n, new Segelflugverhalten());

        // alternativ
        //flugverhalten = new Segelflugverhalten();
    }
    @Override
    public void anzeigen() {
        System.out.println("Rotkopfente zeit stolz ihren roten Kopf");
    }
}
