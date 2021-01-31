package Observer_FAZ_PhilHau;

public class AbonnentA implements Abonnent {
    @Override
    public void erhalteZeitung(Zeitung zeitung) {
        System.out.println("Familie Fischer erhielt die aktuelle Zeitung: " +zeitung.getTitel());
    }
}
