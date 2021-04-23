package Factory_LEDPanelPlant;

public class OLEDPlant extends PanelPlant {
    @Override
    Panel produce(PanelType type, int size) {
        switch(type)
        {
            case OLED:
                if (size == 55 || size == 65){
                    return new OLEDPanel(size);
                }
                return null;
            default:
                return null;
        }
    }
}
