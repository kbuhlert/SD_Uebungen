package Observer_Newsletter_Ue;

public interface SubjectNewsletter {

    public void registerAbonnent (ObserverAbonnent abonnent);
    public void unsubscribeAbonnent (ObserverAbonnent abonnent);
    public void notifyAbonennten();

}
