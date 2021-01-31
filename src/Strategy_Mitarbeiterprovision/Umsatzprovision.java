package Strategy_Mitarbeiterprovision;

public class Umsatzprovision implements Provision {
    @Override
    public double provisionsberechnung(Mitarbeiter m) {
        double umsatzprovision = 0;
        umsatzprovision = m.getUmsatz() * 0.05;
        System.out.println("Mitarbeiter " + m.getName() + " hat Umsatzprovision in Höhe von " + umsatzprovision);
        return umsatzprovision;
    }
}
