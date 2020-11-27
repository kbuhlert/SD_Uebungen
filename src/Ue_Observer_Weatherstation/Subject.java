package Ue_Observer_Weatherstation;

//Subjekt des Observer Patterns, wird vom Subjekt (Newsletter) implementiert

public interface Subject {

    public void registerObserver(Observer o);   //neue Observer registrieren/hinzufügen
    public void removeObserver(Observer o);     //Observer abmelden
    public void notifyObservers();      //informiert alle Observer, wenn sich Daten verändern

}
