package Decorator_Kaffeehaus_Ue;

public class Anwendung {
    public static void main(String[] args) {
        // Espresso mit Milch
        Getraenk esp = new Espresso();
        esp = new Milch(esp);
        System.out.println(esp.getBeschreibung());
        System.out.println(esp.kostet());

        // Filterkaffee mit Milchschaum und Sirup
        Getraenk filter = new Filterkaffee();
        filter = new Milchschaum(filter);
        filter = new Sirup(filter);
        System.out.println(filter.getBeschreibung());
        System.out.println(filter.kostet());
    }
}
