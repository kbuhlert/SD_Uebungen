package Iterator_Stringlist_Ue;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        StringList sl = new StringList("Hallo dies ist ein Test");

        for(String w : sl)
        {
            System.out.println(w);
        }
        System.out.println("---------------------------");

        //alternativ
        Iterator<String> it = sl.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        //wenn zu of it.next aufgerufen wird -> dann wir Exception geworfen
        //it.next();
        }
}
