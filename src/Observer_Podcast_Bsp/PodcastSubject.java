package Observer_Podcast_Bsp;

public interface PodcastSubject {
    public void registerAbonnent(PodcastObserver o);
    public void removeAbonnent(PodcastObserver o);
    public void notifyAbonnent(Podcast p);

}
