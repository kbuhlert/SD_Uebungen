package Ue_Observer_Newsletter;

public interface SubjectNewsletter {

    public void registerAbonnent (ObserverAbonnent abonnent);
    public void unsubscribeAbonnent (ObserverAbonnent abonnent);
    public void notifyAbonennten();

}
