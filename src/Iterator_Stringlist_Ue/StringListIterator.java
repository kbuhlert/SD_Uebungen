package Iterator_Stringlist_Ue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringListIterator implements Iterator<String> {
    //hier legen wir fest wie unser Stringlist-Iterator die Stringliste durchlaufen soll

    //Iterator braucht Bezug zu den Daten und merkt sich aktuelle Position
    private String[] words; //merke mir hier die Daten die ich bekommen habe (in Iterator Funktion der Stringlist)
    private int position;   //merke mir Position

    public StringListIterator(String[] words){
        this.words = words;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        //wenn das Ende des Arrays noch nicht erreicht ist, dann ist Returnwert true (-> es gibt ein nächsstes Elemenet)
        return words.length > position;
    }

    @Override
    public String next() {
        //wir geben das nächste Wort im Array (an Position) zurück
  /*      String next = words[position];
        position++;
        return next;*/

        //besserer code mit Prüfung ob es next gibt und ob
        if(hasNext()) {
            return words[position++];   //iterator liefert das aktuelle Element an position, dann position++
            }
        throw new NoSuchElementException("sind schon am Ende");
    }
}
