package Ue_Observer_Newsletter;

import java.util.ArrayList;

public class Newsletter implements SubjectNewsletter {

    private String zeitungstitel;
    private String zeitungsinhalt;

    private ArrayList<ObserverAbonnent> abonnentenListe;

    public Newsletter(){
        abonnentenListe = new ArrayList<ObserverAbonnent>();
    }

    public void setNewsletterContent(String titel, String inhalt){
        zeitungstitel = titel;
        zeitungsinhalt = inhalt;

        notifyAbonennten();
    }


    @Override
    public void registerAbonnent(ObserverAbonnent abonnent) {
            if(abonnentenListe != null && !abonnentenListe.contains(abonnent)){
                abonnentenListe.add(abonnent);
            }
    }

    @Override
    public void unsubscribeAbonnent(ObserverAbonnent abonnent) {
            if(abonnentenListe != null && abonnentenListe.contains(abonnent)){
                abonnentenListe.remove(abonnent);
            }
    }

    @Override
    public void notifyAbonennten() {
            for (ObserverAbonnent a : abonnentenListe ){
                a.update(zeitungstitel, zeitungsinhalt);
            }
    }
}
