package Factory_LEDPanelPlant;

public class LEDPanel extends Panel{
    public LEDPanel(int size){
        super(size);
    }

    @Override
    public String getIdentifier() {
        return "LED" + size + serial;
    }
}
