package Ue_Singleton_Einstellungen;

public class V2_Threadsicher_Singleton {

    private static V2_Threadsicher_Singleton zahlInstanzen;

    //von Au?en können keine Instanzen erzeugt werden, nur innerhalb der Klasse, da Konstruktor private ist
    private V2_Threadsicher_Singleton() {
        //im Konstruktor könnte Funktionalität stehen

    }

    //mit Synchronized wird es Threadsicher, da nur ein Thread zu einer Zeit die Methode ausführen kann
    public static synchronized V2_Threadsicher_Singleton getInstance(){
        if (zahlInstanzen == null){
            zahlInstanzen = new V2_Threadsicher_Singleton();  //erstellt erste und einzige Singleton Instanz
        }
        return zahlInstanzen;
    }
}
