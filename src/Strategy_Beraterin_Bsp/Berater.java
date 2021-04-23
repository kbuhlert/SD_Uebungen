package Strategy_Beraterin_Bsp;

public class Berater {

    private String name;
    private double stundensatz;
    private double tagessatz;

    public Berater(String name, double stundensatz, double tagessatz) {
        this.name = name;
        this.stundensatz = stundensatz;
        this.tagessatz = tagessatz;
    }

    public String getName() {
        return name;
    }

    public double getStundensatz() {
        return stundensatz;
    }

    public double getTagessatz() {
        return tagessatz;
    }

}
