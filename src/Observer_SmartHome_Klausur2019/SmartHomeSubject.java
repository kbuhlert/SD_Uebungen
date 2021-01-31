package Observer_SmartHome_Klausur2019;

import Observer_Weatherstation_Ue.Observer;

public interface SmartHomeSubject {

    public void registerObserver(SmartHomeObserver o);   //neue Observer registrieren/hinzufügen
    public void removeObserver(SmartHomeObserver o);     //Observer abmelden
    public void notifyObservers();      //informiert alle Observer, wenn sich Daten verändern

}
