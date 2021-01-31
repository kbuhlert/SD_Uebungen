package Decorator_Kaffeehaus_Ue;

public class Milch extends Extrazutat{

    public Milch(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + " mit Milch";
    }

    @Override
    public double kostet() {
        return getraenk.kostet() + 0.5;
    }
}
