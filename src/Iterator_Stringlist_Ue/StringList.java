package Iterator_Stringlist_Ue;

import java.util.Iterator;

public class StringList implements Iterable<String> {
    private String [] text;

    public StringList (String text){
        this.text = text.split(" ");
    }


    @Override
    public Iterator<String> iterator() {
        return new StringListIterator(text);
    }
}
