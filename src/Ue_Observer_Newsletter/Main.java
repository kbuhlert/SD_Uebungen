package Ue_Observer_Newsletter;

public class Main {
    public static void main(String[] args) {
        Newsletter times = new Newsletter();
        PrintAbonnent horst = new PrintAbonnent(times);
        PrintAbonnent helga = new PrintAbonnent(times);

        times.setNewsletterContent("Biden is president", "Trotz einer langen Zitterpartie hat sich gezeigt, dass zumindest eine knappe Mehrheit der Amerikaner keine Volldeppen sind.");

        EMailAbonnent britney = new EMailAbonnent(times);
        times.unsubscribeAbonnent(helga);

        times.setNewsletterContent("Result update: Trump is president", "Und hier haben wir den Beweis, dass eine Mehrheit der Amerikaner doch Volldeppen sind.");

    }
}
