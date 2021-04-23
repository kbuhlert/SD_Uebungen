package Decorator_Kaffeehaus_Ue;

public abstract class Extrazutat extends Getraenk {
    //DECORATOR
    // extend Getränk, damit dann Extrazutaten gezwungen sind die abstrakten Methoden des Getränks (kostet()) zu implementieren
    //jeder Decorator umhüllt ein Getränk

    protected Getraenk getraenk;

    public Extrazutat(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    public abstract String getBeschreibung();
}
