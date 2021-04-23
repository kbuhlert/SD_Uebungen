package Factory_LEDPanelPlant;

public class MicroLEDPanel extends Panel{
    public MicroLEDPanel(int size){
        super(size);
    }
    @Override
    public String getIdentifier() {
        return "MicroLED" + size + serial;
    }
}
