package Strategy_Hunde_PhilHau;

public class Whippet extends Hund{
    public Whippet(String name, Bellverhalten bellverhalten, Laufverhalten laufverhalten) {
        super(name, new Leisewuffen(), new RenntGanzSchnell());
    }
}
