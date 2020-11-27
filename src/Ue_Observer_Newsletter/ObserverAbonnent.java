package Ue_Observer_Newsletter;

public interface ObserverAbonnent {
    /*Ein Medienverlag verfasst Nachrichtenartikel (bestehen aus Titel und Inhalt) und möchte diese an
    Print-und Email-AbonnentInnenausliefern. Setzen Sie das Beispiel mit dem Observer Pattern um.*/
    public void update(String title, String content);
}
