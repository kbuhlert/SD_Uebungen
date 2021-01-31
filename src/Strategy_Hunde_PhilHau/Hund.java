package Strategy_Hunde_PhilHau;

public abstract class Hund {
    private String name;
    private Bellverhalten bellverhalten;
    private Laufverhalten laufverhalten;

    public Hund(String name, Bellverhalten bellverhalten, Laufverhalten laufverhalten) {
        this.name = name;
        this.bellverhalten = bellverhalten;
        this.laufverhalten = laufverhalten;
    }

    public void tubellen(){
        bellverhalten.bellen();
    };
    public void tulaufen(){
        laufverhalten.laufen();
    };

    public void setBellverhalten(Bellverhalten bellverhalten) {
        this.bellverhalten = bellverhalten;
    }

    public void setLaufverhalten(Laufverhalten laufverhalten) {
        this.laufverhalten = laufverhalten;
    }

    public String getName() {
        return name;
    }
}
