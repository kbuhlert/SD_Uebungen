package Observer_Weatherstation_Ue;

public class SmartphoneDisplay implements Observer, DisplayElement{

    private double temperatur;
    private double pressure;

    private Subject wetterData; //merken uns Rferenz auf unser Subjekt, damit wir wider unsubscriben können

    public SmartphoneDisplay(Subject wetterData) {
        this.wetterData = wetterData;
        //wir haben das im Konstruktor gemacht, das könnte aber auch eine eigene Methode sein, die extra aufgerufen ist
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

    public void stopReceiving(){
        wetterData.registerObserver(this);
        wetterData = null; //abhäbgig von bestimmten Anwendungen -> bräuchte dann aber auch eine Setter Methode um  die wieder neu zu setzen
    }

    //was ist was (was hat interessante informationen, wovon gibt es meherer die diese Infos wollen)

    //wenn keine Infos mehr kommen sollen, dann muss es Methode zum Abmelden geben
}
