package Ue_Strategy_Mitarbeiterprovision;

public class Mitarbeiter {
    /*MitarbeiterInnen besitzen die Eigenschaften Name, Umsatz und Gewinn. */
    private String name;
    private Double umsatz;
    private Double gewinn;

    public Mitarbeiter(String name, Double umsatz, Double gewinn) {
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

    public Double getUmsatz() {
        return umsatz;
    }

    public void setUmsatz(Double umsatz) {
        this.umsatz = umsatz;
    }

    public Double getGewinn() {
        return gewinn;
    }

    public void setGewinn(Double gewinn) {
        this.gewinn = gewinn;
    }
}
