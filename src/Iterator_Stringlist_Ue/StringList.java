package Iterator_Stringlist_Ue;

import java.util.Iterator;

public class StringList implements Iterable<String> {
    private String [] text;

    public StringList (String text){
        this.text = text.split(" ");
    }

    //wenn die Methode stringList.iterator(); aufgerufen wird (geht weil Iterable implementiert ist), wird hier der eigene Iterator mit eigener spezieller Funktion aufgerufen
    @Override
    public Iterator<String> iterator() {
        return new StringListIterator(text);
    }   //geb dem iterator mit, über welche Daten iteriert werden soll (hier text), könnte aber auch Bsp. Mitarbeiter aus Datenbank sein
}
