package Factory_Pizza_Ue;

//abstrakte Vorlage für Pizzen
//um nicht in jeder Subklasse alle Methoden erzeugen zu müssen und um eine klare Vorgabe zu haben
//wird das mit der abtrakten Klasse vorgegeben
public abstract class Pizza {

    String name; //wird von abgeleitete Klassen belegt

    void prepare(){
        System.out.println("Prepare " + name);
    }
    void bake(){
        System.out.println("let dough rise and bake");
    }
    void cut(){
        System.out.println("cut Pizza");
    }
    void box(){
        System.out.println("Put Pizza in box ");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "---- Pizza: " +
                "name='" + name +
               " ' ------'";
    }
}
