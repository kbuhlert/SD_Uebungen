package Observer_FAZ_PhilHau;

public interface Abonnent {

    //Problemloses Erstellen und Hinzufügen von neuen Abonnenten ohne den Verlagcode anfassen zu müssen.
    // Der neue Abonnent muss einzig und allein das Abonnenteninterface implementieren.
    // Wir erhalten hohe Wiederverwendbarkeit und Erweiterbarkeit.

    public void erhalteZeitung(Zeitung zeitung);

    //Eine Klasse kann nun Abonnent von vielen verschiedenen Dingen werden, wie Newsletter, Magazinen oder
    // anderen Zeitungen. Es muss nur die entsprechenden Interfaces implementieren und sein Abo anmelden.
}
