package Oberver_Medienverlag;

public class PrintAbonnent implements AbonnentObserver{

    private String name;
    private ObservableSubjectMedienverlag medienverlag;

    public PrintAbonnent(String name, ObservableSubjectMedienverlag medienverlag) {
        this.name = name;
        this.medienverlag = medienverlag;
        this.medienverlag.registerAbonnent(this);
    }

    @Override
    public void getAbo(Nachrichtenartikel artikel) {
        System.out.println(name + " erhält gedruckte Nachrichten:" + artikel);
    }
}
