package Ue_Decorator_Kaffeehaus;

public class Milch extends Extrazutat{

    public Milch(Getränk getränk) {
        super(getränk);
    }

    @Override
    public String getBeschreibung() {
        return getränk.getBeschreibung() + " mit Milch";
    }

    @Override
    public int kostet() {
        return getränk.kostet() + 1;
    }
}
