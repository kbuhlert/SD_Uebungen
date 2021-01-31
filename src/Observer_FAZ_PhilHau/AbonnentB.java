package Observer_FAZ_PhilHau;

public class AbonnentB implements Abonnent{
    @Override
    public void erhalteZeitung(Zeitung zeitung) {
            System.out.println("Familie Meier erhielt die aktuelle Zeitung: " + zeitung.getTitel());
    }
}
