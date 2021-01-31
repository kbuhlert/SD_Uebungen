package Strategy_Mitarbeiterprovision;

public interface Provision {
    /*MitarbeiterInnen besitzen die Eigenschaften Name, Umsatz und Gewinn. MitarbeiterManager verwaltet MitarbeiterInnen
        in einer Liste und bietet weiters eine Methode um ihre Provisionen zu berechnen. Die Provision für alle MitarbeiterInnen
         ist entweder 10% des Gewinns oder 5% des Umsatzes.*/
    public double provisionsberechnung(Mitarbeiter m);
}
