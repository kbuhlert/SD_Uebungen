package Decorator_Kaffeehaus_Ue;

public class Filterkaffee extends Getraenk {

    public Filterkaffee() {
        beschreibung = "Filterkaffee";
    }

    @Override
    public double kostet() {
        return 2.0;
    }
}
