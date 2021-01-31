package Strategy__CarCharging_Klausur19;

public class Car {
    private String marke;
    private double ladestand;
    private double capacity;

    public Car(String marke, double capacity) {
        this.marke = marke;
        this.capacity = capacity;
        this.ladestand = capacity;
    }

    public String getMarke() {
        return marke;
    }

    public double getLadestand() {
        return ladestand;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setLadestand(double ladestand) {
        this.ladestand = ladestand;
    }
}
