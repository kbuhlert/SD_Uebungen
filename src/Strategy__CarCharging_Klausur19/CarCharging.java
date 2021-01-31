package Strategy__CarCharging_Klausur19;

public class CarCharging {
    private Car car;
    private double ladedauer;

    public CarCharging(Car car, double ladedauer) {
        this.car = car;
        this.ladedauer = ladedauer;
    }

    //ermöglicht dieser Klasse das flexible Wechseln von alternativen Verhalten
    //das Verhaltensobjekt (PricingStrategy ruft dann die entsprechende implementierung der Methode auf)
    //die Ladestation ist von ihrem Verhalten entkoppelt und kennt nur noch die Schnittstelle (Preisstrategie)

    public double calcPrice (PricingStrategy ps){

        return ps.berchnePreis(this);
    }

    public Car getCar() {
        return car;
    }

    public double getLadedauer() {
        return ladedauer;
    }
}
