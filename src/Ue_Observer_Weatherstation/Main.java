package Ue_Observer_Weatherstation;

public class Main {
    public static void main(String[] args) {
        Wetterstation ws = new Wetterstation();

        DigitalDisplay digitalDisplay = new DigitalDisplay(ws);
        ws.setMeasurements(20,65,1000);
        //hier müsste Ausgabe für Digital Display kommen
        System.out.println("----------------");
        SmartphoneDisplay smartphoneDisplay = new SmartphoneDisplay(ws);
        ws.setMeasurements(20.3, 54, 999);
        //hier müsste jetzt ausgabe für Smartphoen und Digital Display kommen
    }
}
