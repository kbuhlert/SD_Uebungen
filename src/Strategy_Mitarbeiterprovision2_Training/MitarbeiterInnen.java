package Strategy_Mitarbeiterprovision2_Training;

public class MitarbeiterInnen {
    private String name;
    private int umsatz;
    private int gewinn;

    public MitarbeiterInnen(String name, int umsatz, int gewinn) {
        this.name = name;
        this.umsatz = umsatz;
        this.gewinn = gewinn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUmsatz() {
        return umsatz;
    }

    public void setUmsatz(int umsatz) {
        this.umsatz = umsatz;
    }

    public int getGewinn() {
        return gewinn;
    }

    public void setGewinn(int gewinn) {
        this.gewinn = gewinn;
    }
}
