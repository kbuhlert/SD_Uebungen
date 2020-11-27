package Ue_Decorator_Kaffeehaus;

public class Espresso extends Getränk{
    public Espresso() {
        beschreibung = "Espresso";
    }

    @Override
    public int kostet() {
        return 2;
    }

}
