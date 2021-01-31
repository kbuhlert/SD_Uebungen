package Observer_Weatherstation_Ue;

//Observer Patter -> Observer /wird von allen implementiert, die informiert werden wollen

public interface Observer {

    public void update(double temperatur, double humidity, double pressure);
}
