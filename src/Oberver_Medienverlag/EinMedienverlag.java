package Oberver_Medienverlag;

import java.util.ArrayList;
import java.util.List;

public class EinMedienverlag implements ObservableSubjectMedienverlag{

    private List<AbonnentObserver> abonnenten = new ArrayList<>();

    @Override
    public void registerAbonnent(AbonnentObserver abonnent) {
        abonnenten.add(abonnent);
    }

    @Override
    public void unsubscribeAbonnent(AbonnentObserver abonnent) {
        abonnenten.remove(abonnent);
    }

    @Override
    public void notifyAbonennten(Nachrichtenartikel news) {
            for(AbonnentObserver a : abonnenten){
                a.getAbo(news);
            }
    }
}
