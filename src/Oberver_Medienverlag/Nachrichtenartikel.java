package Oberver_Medienverlag;

public class Nachrichtenartikel {
    protected String titel;
    protected String content;

    public Nachrichtenartikel(String titel, String content) {
        this.titel = titel;
        this.content = content;
    }

    @Override
    public String toString() {
        return "News:" + titel + '\'' + content ;
    }
}
