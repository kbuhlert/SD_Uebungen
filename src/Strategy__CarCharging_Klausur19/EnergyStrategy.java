package Strategy__CarCharging_Klausur19;

public class EnergyStrategy implements PricingStrategy {
    @Override
    public double berchnePreis(CarCharging cc) {
        double verbrauchteKW = (cc.getCar().getCapacity() - cc.getCar().getLadestand())*0.2;
        return verbrauchteKW;
    }
}
