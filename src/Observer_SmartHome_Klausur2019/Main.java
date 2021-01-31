package Observer_SmartHome_Klausur2019;

public class Main {
    public static void main(String[] args) {
        DataStore ds = new DataStore();
        ds.setLuftfeuchtigkeit(70);
        AlarmSystem as = new AlarmSystem(ds);
        IndoorClimate ic = new IndoorClimate(ds);
        ds.setdoorClosed(false);
        as.update();
        ds.setdoorClosed(true);
        ds.setWindowsClosed(true);
        ic.update();
        as.update();
    }
}
