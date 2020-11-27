package Ue_Decorator_Kaffeehaus;

public abstract class Extrazutat extends Getränk {
    //DECORATOR
    //jeder Decorator umhüllt ein Getränk

    protected Getränk getränk;

    public Extrazutat(Getränk getränk) {
        this.getränk = getränk;
    }

    public abstract String getBeschreibung();
}
