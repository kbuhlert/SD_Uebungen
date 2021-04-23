package Iterator_Einkaufstasche_Ue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class EinkaufstaschenIterator implements Iterator<Artikel> {

    private ArrayList<Artikel> tascheninhalt;
    private int position;

    public EinkaufstaschenIterator(ArrayList<Artikel> tascheninhalt) {
        this.tascheninhalt = tascheninhalt;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if (tascheninhalt.size() > position){
            return true;
        }
        return false;
    }

    @Override
    public Artikel next() {
        if(hasNext()){
            Artikel currentArticle = tascheninhalt.get(position);
            position++;
            return currentArticle;
        }
        throw new NoSuchElementException("keine weiteren Artikel in der Tasche");
    }
    //Klasse muss Iterator<Wunschklasse> implementieren und diese Methoden überschreiben


}
