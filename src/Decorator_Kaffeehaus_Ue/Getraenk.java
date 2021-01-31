package Decorator_Kaffeehaus_Ue;

public abstract class Getraenk {

    protected String beschreibung = "unbekanntes Getränk";

    public String getBeschreibung() {
        return beschreibung;
    }

    public abstract double kostet();
}
