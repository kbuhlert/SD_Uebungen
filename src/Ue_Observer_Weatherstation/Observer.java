package Ue_Observer_Weatherstation;

//Observer Patter -> Observer /wird von allen implementiert, die informiert werden wollen

public interface Observer {

    public void update(double temperatur, double humidity, double pressure);
}
