package Observer_Newsletter_Ue;


public class PrintAbonnent implements ObserverAbonnent{

    private String zeitungstitel;
    private String zeitungsinhalt;

    private SubjectNewsletter newsletter;

    public PrintAbonnent(SubjectNewsletter news){
        this.newsletter = news;
        newsletter.registerAbonnent(this);
    }



    @Override
    public void update(String title, String content) {
        zeitungstitel = title;
        zeitungsinhalt = content;
        System.out.println("Titel: " + zeitungstitel);
        System.out.println("Story: " + zeitungsinhalt);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
