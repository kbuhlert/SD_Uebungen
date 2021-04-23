package Strategy_Beraterin_Bsp;

public class Rechnung {

    private Berater berater;
    private double stunden;

    public Rechnung(Berater berater, double stunden) {
        this.berater = berater;
        this.stunden = stunden;
    }

    public double calcPrice(IStrategie strategie){
        return strategie.calc(this);
    }

    public Berater getBerater() {
        return berater;
    }

    public double getStunden() {
        return stunden;
    }
}
