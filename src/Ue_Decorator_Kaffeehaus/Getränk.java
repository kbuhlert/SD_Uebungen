package Ue_Decorator_Kaffeehaus;

public abstract class Getränk {

    public abstract int kostet();
    protected String beschreibung = "unbekanntes Getränk";

    public String getBeschreibung() {
        return beschreibung;
    }
}
