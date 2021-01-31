package Observer_Newsletter_Ue;

public class EMailAbonnent implements ObserverAbonnent{

    private String zeitungstitel;

    private SubjectNewsletter newsletter;

    public EMailAbonnent(SubjectNewsletter news){
        this.newsletter = news;
        newsletter.registerAbonnent(this);
    }


    @Override
    public void update(String title, String content) {
        zeitungstitel = title;
        System.out.println("Breaking News-Pushnachricht: " + zeitungstitel);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
