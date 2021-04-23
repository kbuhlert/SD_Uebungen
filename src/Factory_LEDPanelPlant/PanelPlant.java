package Factory_LEDPanelPlant;

import java.util.ArrayList;
import java.util.List;

public abstract class PanelPlant {
    private List<String> producedPanels;
    public PanelPlant()
    {
        producedPanels = new ArrayList<String>();
    }
    private void registerPanel(String pId){
        producedPanels.add(pId);
    }
    public boolean checkPanelGenuine(String pId) {
        return producedPanels.contains(pId);
    }


    abstract Panel produce(PanelType type, int size);   //das Erzeugen der Produkte ist auf Subklasse ausgelagert (muss von Subklasse implementiert werden


    public Panel getPanel(PanelType type, int size) {   //Code muss nicht angerührt werden


        Panel p = produce(type, size);

        if ( p == null)
        {
            return null;
        }

        registerPanel(p.getIdentifier());

        return p;
    }
}
