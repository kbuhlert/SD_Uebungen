package Factory_LEDPanelPlant;

public class LEDPlant extends PanelPlant{
    @Override
    Panel produce(PanelType type, int size) {   //Wie Grazer-pizzen vs. Wiener Pizzen, hier wird Konrstruktor aufgerufen unddas Produkt hergestellt
        switch(type)
        {
            case LED:
                return new LEDPanel(size);
            case MICROLED:
                if (size == 55 || size == 65){
                    return new MicroLEDPanel(size);
                }
                return null;
            default:
                return null;
        }
    }
}
