package Strategy_Mitarbeiterprovision;

public class Anwendung {
    public static void main(String[] args) {
        /*MitarbeiterInnen besitzen die Eigenschaften Name, Umsatz und Gewinn. MitarbeiterManager verwaltet MitarbeiterInnen
        in einer Liste und bietet weiters eine Methode um ihre Provisionen zu berechnen. Die Provision für alle MitarbeiterInnen
         ist entweder 10% des Gewinns oder 5% des Umsatzes.*/

        Mitarbeiter m1 = new Mitarbeiter("Horst", 1007.10, 578.9);
        Mitarbeiter m2 = new Mitarbeiter("Karin", 1507.10, 968.9);
        Mitarbeiter m3 = new Mitarbeiter("Emil", 907.10, 888.9);

        Mitarbeitermanager mgmt = new Mitarbeitermanager(new Umsatzprovision());
        mgmt.addMitarbeiter(m1);
        mgmt.addMitarbeiter(m2);
        mgmt.addMitarbeiter(m3);
        mgmt.provisionsBerechnung();
        mgmt.setProvision(new Gewinnprovision());
        mgmt.provisionsBerechnung();



    }
}
