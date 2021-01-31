package Command_SmarteFernbedienung1_Ue;

public class EinfacheSmarteFernbedienung {
    //hat nur eine Taste (-> "einfach")
    //Kann Kommando für eine Taste speichern und dieses dann ausführen

    private Kommando slot;

    //ein programmierter Knopf = ein Kommando,
    // durch erneuten aufruf kann Kommando geändert werden
    public void setKommando(Kommando k){
        slot = k;
    }

    //Kommando wird ausgeführt wenn Knopf gedrückt wird
    public void knopfgedrueckt(){
        slot.ausfuehren();
    }
}
