package Observer_FAZ_PhilHau;

public class Main {
    public static void main(String[] args) {
        FAZ verlag = new FAZ();
        verlag.aboHinzufuegen(new AbonnentA());
        verlag.aboHinzufuegen(new AbonnentB());
        AbonnentA firma = new AbonnentA();
        verlag.aboHinzufuegen(firma);

        verlag.setAktuelleZeitung(new Zeitung("Skandal!"));
        //Familie Fischer erhielt die aktuelle Zeitung: Skandal!
        //Familie Meier erhielt die aktuelle Zeitung: Skandal!
        //Firma XY erhielt die aktuelle Zeitung: Skandal!

        verlag.aboEntfernen(firma);
        verlag.setAktuelleZeitung(new Zeitung("Doch alles halb so wild!"));
        //Familie Fischer erhielt die aktuelle Zeitung: Doch alles halb so wild!
        //Familie Meier erhielt die aktuelle Zeitung: Doch alles halb so wild!
    }
}
