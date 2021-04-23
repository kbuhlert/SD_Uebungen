package Factory_LEDPanelPlant;

public class OLEDPanel extends Panel{

    public OLEDPanel(int size){
        super(size);
    }

    @Override
    public String getIdentifier() {
        return "OLED" + size + serial;
    }
}
