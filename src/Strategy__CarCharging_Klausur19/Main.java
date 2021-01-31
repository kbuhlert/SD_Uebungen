package Strategy__CarCharging_Klausur19;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car("porsche", 250);
        CarCharging cc = new CarCharging(porsche, 25);

        porsche.setLadestand(170);

        Double kosten = cc.calcPrice(new EnergyStrategy());
        System.out.println("Des koscht " + kosten);


        Double kosten2 = cc.calcPrice(new MinuteStrategy());
        System.out.println("Des koscht " + kosten2);
    }
}
