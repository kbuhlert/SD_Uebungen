package Observer_SmartHome_Klausur2019;

import Observer_Newsletter_Ue.ObserverAbonnent;
import Observer_Weatherstation_Ue.Observer;

import java.util.ArrayList;

public class DataStore implements SmartHomeSubject {
    private double luftfeuchtigkeit;
    private boolean windowclosed;
    private boolean doorclosed;
    private ArrayList<SmartHomeObserver> abonnentenliste;

    public DataStore(){
        abonnentenliste = new ArrayList<SmartHomeObserver>();

    }

    public void alleDatenAktualisieren (double luftfeuchtigkeit, boolean windowclosed, boolean doorclosed){
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.windowclosed = windowclosed;
        this.doorclosed = doorclosed;

        notifyObservers();
    }

    public void setdoorClosed(boolean doorclosed) {
        this.doorclosed = doorclosed;
        notifyObservers();
    }

    public void setWindowsClosed(boolean windowsClosed) {
        this.windowclosed = windowsClosed;
        notifyObservers();
    }

    public void setLuftfeuchtigkeit(double humidity) {
        this.luftfeuchtigkeit = humidity;
        notifyObservers();
    }

    public double getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public boolean isWindowclosed() {
        return windowclosed;
    }

    public boolean isDoorclosed() {
        return doorclosed;
    }

    @Override
    public void registerObserver(SmartHomeObserver o) {
        abonnentenliste.add(o);
    }

    @Override
    public void removeObserver(SmartHomeObserver o) {

    }

    @Override
    public void notifyObservers() {

    }
}
