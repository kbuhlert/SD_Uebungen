package Observer_Weatherstation_Ue;

import java.util.ArrayList;

public class Wetterstation implements Subject{

    private double temperatur;
    private double humidity;
    private double pressure;

    private ArrayList<Observer> obervers;

    public Wetterstation() {
        obervers = new ArrayList<Observer>();
    }

    public void setMeasurements (double t, double h, double p){
        temperatur = t;
        humidity = h;
        pressure = p;

        //Daten haben sich geändert -> wir wollen Observer/Display informieren //WICHTIG!
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        if(o != null && !obervers.contains(o)){
        obervers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if(o != null && obervers.contains(o)){
            obervers.remove(o);
        }
    }

    @Override   //wir möchten alle observer/Digitalanzeigen über eine Datenänderung informieren
    public void notifyObservers() {
        for(Observer o: obervers){
            o.update(temperatur, humidity, pressure);
        }
    }
}
