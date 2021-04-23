package Observer_Weatherstation_Ue;

//Observer Patter -> Observer /wird von allen implementiert, die informiert werden wollen

public interface Observer {
    //wenn immer die gleichen Daten, dann als Parameter, ansonsten wird im update das Objekt zurück geliefert, von dem dann mit getter mMethoden die Informationen geholt werden die gebraucht werden vom Observer
    public void update(double temperatur, double humidity, double pressure);
}
