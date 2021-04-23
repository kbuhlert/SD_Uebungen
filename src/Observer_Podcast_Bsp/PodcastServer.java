package Observer_Podcast_Bsp;

import java.util.ArrayList;
import java.util.List;

public class PodcastServer implements PodcastSubject {
    /*Erstellen Sie eine Klasse PodcastServer die einzelne Podcasts verwalten kann. Ein Podcast (eigene Klasse)
    besteht aus einem Namen (String), einem URL (String) und einer Länge in Minuten (double).
    Erstellen Sie dafür Konstruktor, getter und setter. Der PodcastServer soll alle bisherigen Podcasts speichern
    und eine Methode bieten um einen neuen Podcast hinzuzufügen. Wenn ein neuer Podcast hinzugefügt wird
    sollen alle PodcastabonnentInnen über den neuen Podcast informiert werden. Die Geräte Notebook,
    Smartphone und Smartwatch (jeweils Klasse erstellen) haben Podcast Player integriert und sollen
    die Funktionalität erhalten sich bei Interesse am Podcast Server zu registrieren bzw.
    informiert zu werden wenn es neue Podcasts gibt.*/

    private Podcast podcast;
    private ArrayList<Podcast> allePodcasts = new ArrayList<>();
    private List<PodcastObserver> abonnentenListe = new ArrayList<>();

    public void addPodcast(Podcast podcast){
        allePodcasts.add(podcast);
    }

    @Override
    public void registerAbonnent(PodcastObserver o) {
        abonnentenListe.add(o);
    }

    @Override
    public void removeAbonnent(PodcastObserver o) {
        abonnentenListe.remove(o);
    }

    @Override
    public void notifyAbonnent(Podcast p) {
        for (PodcastObserver o : abonnentenListe){
            o.update(p);
        }
    }
}
