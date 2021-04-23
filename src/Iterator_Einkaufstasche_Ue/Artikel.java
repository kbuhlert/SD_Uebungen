package Iterator_Einkaufstasche_Ue;


public class Artikel {

    private String namen;
    private Double gewicht;

    public Artikel(String namen, Double gewicht) {
        this.namen = namen;
        this.gewicht = gewicht;
    }

    public String getNamen() {
        return namen;
    }

    public void setNamen(String namen) {
        this.namen = namen;
    }

    public Double getGewicht() {
        return gewicht;
    }

    public void setGewicht(Double gewicht) {
        this.gewicht = gewicht;
    }
}
