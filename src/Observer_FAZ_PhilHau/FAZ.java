package Observer_FAZ_PhilHau;

public class FAZ extends ZeitungsHerausgeber{
    //Verlag und Abonnenten sind entkoppelt, da der Verlag seine konkreten Abonnenten nicht kennt.

    private Zeitung aktuelleZeitung;

    public void setAktuelleZeitung(Zeitung aktuelleZeitung) {
        this.aktuelleZeitung = aktuelleZeitung;
        //Nach dem einen neue Zeitung gesetzt wurde, werden alle Abonnenten benachrichtigt.
        verteileZeitung(aktuelleZeitung);
    }

    public Zeitung getAktuelleZeitung() {
        return aktuelleZeitung;
    }
}
