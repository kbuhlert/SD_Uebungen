package Ue_Observer_Weatherstation;

public class SmartphoneDisplay implements Observer, DisplayElement{

    private double temperatur;
    private double pressure;

    private Subject wetterData; //merken uns Rferenz auf unser Subjekt, damit wir wider unsubscriben können

    public SmartphoneDisplay(Subject wetterData) {
        this.wetterData = wetterData;
        this.wetterData.registerObserver(this);  //bezieht sich auf das Objekt selber
    }

    @Override
    public void display() {
        System.out.println("Smartphone: " + temperatur + "°C // " + pressure + "bar");
    }

    @Override
    public void update(double temperatur, double humidity, double pressure) {
        this.temperatur = temperatur;
        this.pressure = pressure;
        display();
    }
}
