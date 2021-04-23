package Oberver_Medienverlag;

import Observer_Newsletter_Ue.ObserverAbonnent;

public interface ObservableSubjectMedienverlag {
    public void registerAbonnent (AbonnentObserver abonnent);
    public void unsubscribeAbonnent (AbonnentObserver abonnent);
    public void notifyAbonennten(Nachrichtenartikel news);
}
