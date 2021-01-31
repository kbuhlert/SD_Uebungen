package Strategy_Mitarbeiterprovision;

public class Gewinnprovision implements Provision{
    @Override
    public double provisionsberechnung(Mitarbeiter m) {
        double gewinnprovision = 0;
        gewinnprovision = m.getGewinn() * 0.1;
        System.out.println("Mitarbeiter " + m.getName() + " hat Gewinnprovision in Höhe von " + gewinnprovision);
        return gewinnprovision;
    }
}
