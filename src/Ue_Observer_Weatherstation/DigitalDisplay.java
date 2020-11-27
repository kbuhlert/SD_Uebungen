package Ue_Observer_Weatherstation;

//Display = Wetteranzeige Display in unserem Bsp.

public class DigitalDisplay implements Observer, DisplayElement{

    private double temperatur;  //Display zeigt Temp an

    private Subject wetterData; //merken uns Rferenz auf unser Subjekt, damit wir wider unsubscriben können

    public DigitalDisplay(Subject wd){
        wetterData = wd;
        wetterData.registerObserver(this);  //bezieht sich auf das Objekt selber
    }


    //jetzt kommt Methode die nichts mit dem Pattern zu tun hat, sondern nur wegen unserer Wetter-Anwendung implementiert wird



    @Override
    public void display() {
        System.out.println("Digitalanzeige: " + temperatur);

    }

    @Override   //wird von Subject aufgerufen, wenn sich Daten ändern
    public void update(double temp, double humidity, double pressure) {
        this.temperatur = temp;

        //weil wir Display sind, rufen wir die Displaymethode auf,
        // die hat aber nix direkt mit dem Pattern zu tun, hier geben wir auf dem Display die aktualisierten Daten aus
        display();
        //hier könnte zum Beispiel auch eine Benachrichtigung per E-Mail versendet werden

    }
}
