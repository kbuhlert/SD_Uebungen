package Decorator_Kaffeehaus_Ue;

public class Espresso extends Getraenk {
    public Espresso() {
        beschreibung = "Espresso";
    }

    @Override
    public double kostet() {
        return 2.0;
    }

}
