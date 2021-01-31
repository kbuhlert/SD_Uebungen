package Decorator_Kaffeehaus_Ue;

public abstract class Extrazutat extends Getraenk {
    //DECORATOR
    //jeder Decorator umhüllt ein Getränk

    protected Getraenk getraenk;

    public Extrazutat(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    public abstract String getBeschreibung();
}
