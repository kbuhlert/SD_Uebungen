package Observer_Weatherstation_Ue;

//Vorlage für Subjekte des Observer Patterns, es wird vom Subjekt (Newsletter) implementiert
//Subject weiß über Observer nur, dass Interface implementiert wird
//Neue Observer können während Laufzeit hinzugefügt werden

public interface Subject {

    public void registerObserver(Observer o);   //neue Observer registrieren/hinzufügen
    public void removeObserver(Observer o);     //Observer abmelden
    public void notifyObservers();      //informiert alle Observer, wenn sich Daten verändern

}
