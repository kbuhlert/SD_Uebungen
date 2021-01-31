package Observer_SmartHome_Klausur2019;

public class IndoorClimate implements SmartHomeObserver{
    private boolean shouldOpenWindow;
    private DataStore ds;

    public IndoorClimate(DataStore ds) {
        this.shouldOpenWindow = false;
        this.ds = ds;
        ds.registerObserver(this);
    }


    @Override
    public void update() {
        if(ds.getLuftfeuchtigkeit()>=70){
            shouldOpenWindow = true;
            System.out.println("Fenster öffnen");
        }
        else {
            shouldOpenWindow = false;
            System.out.println("Fenster können geschlossen bleiben");
        }
    }
}
