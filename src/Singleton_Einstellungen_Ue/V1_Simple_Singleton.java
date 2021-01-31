package Singleton_Einstellungen_Ue;

public class V1_Simple_Singleton {

    private static V1_Simple_Singleton zahlInstanzen;

    //von Au?en können keine Instanzen erzeugt werden, nur innerhalb der Klasse, da Konstruktor private ist
    private V1_Simple_Singleton() {
        //im Konstruktor könnte Funktionalität stehen

    }

    public static V1_Simple_Singleton getInstance(){
        if (zahlInstanzen == null){
            zahlInstanzen = new V1_Simple_Singleton();  //erstellt erste und einzige Singleton Instanz
            //Problem: Ist nicht Threadsicher (->Race-Condition), wenn beide Threads gleichzeitig in if-Bedingung reingehen, dann würden zwei Instanzen erzeugt werden
        }
        return zahlInstanzen;
    }

    //hier stehen restliche Methoden die zur Funktionalität dienen

}
