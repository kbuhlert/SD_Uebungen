package Strategy_Beraterin_Bsp;

public class Main {
    public static void main(String[] args) {
        Berater berater = new Berater("Max",25.0,190);
        Rechnung rechnung = new Rechnung(berater, 22.5);

        IStrategie stundenrechnung = new Stundenstrategie();
        IStrategie tagesrechnung = new VolleTageStrategie();

        System.out.println("Preis nach Stunden: " + stundenrechnung.calc(rechnung));
        System.out.println("Preis nach Tagen: " + tagesrechnung.calc(rechnung));
    }
}
