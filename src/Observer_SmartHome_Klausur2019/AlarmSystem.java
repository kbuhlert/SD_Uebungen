package Observer_SmartHome_Klausur2019;

public class AlarmSystem implements SmartHomeObserver{
    private boolean canBeActivated;
    private DataStore ds;

    public AlarmSystem(DataStore ds) {
        this.ds = ds;
        canBeActivated = false;
        ds.registerObserver(this);
    }

    public boolean isCanBeActivated() {
        return canBeActivated;
    }

    @Override
    public void update() {
        boolean openWindowsOrDoors = ds.isDoorclosed() && ds.isWindowclosed();
        if (openWindowsOrDoors){
            canBeActivated = true;
            System.out.println("Alarmanlage kann aktiviert werden");
        }
        else {
            canBeActivated = false;
            System.out.println("Alarmanlage muss augeschaltet bleiben");
        }
    }
}
