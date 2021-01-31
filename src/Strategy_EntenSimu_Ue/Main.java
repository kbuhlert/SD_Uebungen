package Strategy_EntenSimu_Ue;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ente> entenhausen = new ArrayList<Ente>();

        entenhausen.add(new Gummiente("Donald"));
        entenhausen.add(new Rotkopfente("Daisy"));
        entenhausen.add(new Rotkopfente("Dagobert"));
        entenhausen.add(new Gummiente("Sir Quietschalot"));

        for(Ente e : entenhausen)
        {
            e.fliegen();
            e.anzeigen();
        }
    }
}
