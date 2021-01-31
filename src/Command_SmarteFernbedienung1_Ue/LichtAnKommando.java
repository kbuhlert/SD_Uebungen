package Command_SmarteFernbedienung1_Ue;

public class LichtAnKommando implements Kommando {
    private Licht licht;

    //Konstruktor bekommt das Licht mit auf welches das Kommando angewendet werden soll,
    // das Licht ist dann der Empfänger (Receiver) für Anfrage
    public LichtAnKommando(Licht licht) {
        this.licht = licht;
    }

    // ruft die Methode des Empfängers (das angesteuerte Licht) auf
    @Override
    public void ausfuehren() {
        licht.an();
    }
}
