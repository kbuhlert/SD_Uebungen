package Decorator_Kaffeehaus_Ue;

public class Sirup extends Extrazutat {
    public Sirup(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + " mit Sirup";
    }

    @Override
    public double kostet() {
        return getraenk.kostet() + 1.2;
    }
}
