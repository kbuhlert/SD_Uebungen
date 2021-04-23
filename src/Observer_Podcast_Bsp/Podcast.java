package Observer_Podcast_Bsp;

public class Podcast {
        /*Erstellen Sie eine Klasse PodcastServer die einzelne Podcasts verwalten kann. Ein Podcast (eigene Klasse)
    besteht aus einem Namen (String), einem URL (String) und einer Länge in Minuten (double).
    Erstellen Sie dafür Konstruktor, getter und setter. Der PodcastServer soll alle bisherigen Podcasts speichern
    und eine Methode bieten um einen neuen Podcast hinzuzufügen. Wenn ein neuer Podcast hinzugefügt wird
    sollen alle PodcastabonnentInnen über den neuen Podcast informiert werden. Die Geräte Notebook,
    Smartphone und Smartwatch (jeweils Klasse erstellen) haben Podcast Player integriert und sollen
    die Funktionalität erhalten sich bei Interesse am Podcast Server zu registrieren bzw.
    informiert zu werden wenn es neue Podcasts gibt.*/

    private String name;
    private String url;
    private double minuten;

    public Podcast(String name, String url, double minuten) {
        this.name = name;
        this.url = url;
        this.minuten = minuten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getMinuten() {
        return minuten;
    }

    public void setMinuten(double minuten) {
        this.minuten = minuten;
    }
}
