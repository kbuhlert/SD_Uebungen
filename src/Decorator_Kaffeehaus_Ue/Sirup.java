package Decorator_Kaffeehaus_Ue;

public class Sirup extends Extrazutat {
    public Sirup(Getraenk getraenk) {
        super(getraenk);
    }

    //abstrakte Methode von Zutatenklasse
    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + " mit Sirup";
    }

    // abstrakte Methode vom Getränk
    @Override
    public double kostet() {
        return getraenk.kostet() + 1.2;
    }
}
