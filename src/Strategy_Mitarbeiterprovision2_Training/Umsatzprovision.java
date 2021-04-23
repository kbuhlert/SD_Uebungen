package Strategy_Mitarbeiterprovision2_Training;

public class Umsatzprovision implements Provision{
    @Override
    public double provisionsberechnung(MitarbeiterInnen m) {
        double umsatzprovision = m.getUmsatz() * 0.05;
        System.out.println(m.getName() + " erhält Umsatzprovision: " + umsatzprovision);
        return umsatzprovision;
    }
}
