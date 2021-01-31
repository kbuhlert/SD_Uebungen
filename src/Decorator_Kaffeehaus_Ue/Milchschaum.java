package Decorator_Kaffeehaus_Ue;

public class Milchschaum extends Extrazutat {
    public Milchschaum(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + " mit Milchschaum";
    }

    @Override
    public double kostet() {
        return getraenk.kostet() + 0.6;
    }

}
