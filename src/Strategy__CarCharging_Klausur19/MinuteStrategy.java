package Strategy__CarCharging_Klausur19;

public class MinuteStrategy implements PricingStrategy {

    @Override
    public double berchnePreis(CarCharging cc) {

        return cc.getLadedauer()*0.45;
    }
}
