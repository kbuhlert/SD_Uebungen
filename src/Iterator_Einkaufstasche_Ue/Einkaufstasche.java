package Iterator_Einkaufstasche_Ue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Einkaufstasche implements Iterable<Artikel>{
    ArrayList<Artikel> einkaufstasche = new ArrayList<>();

    public List<Artikel> getEinkaufstasche() {
        return einkaufstasche;
    }

    public void add(Artikel a) {
        einkaufstasche.add(a);
    }

    @Override
    public Iterator<Artikel> iterator() {
        return new EinkaufstaschenIterator(einkaufstasche);
    }

    @Override
    public void forEach(Consumer<? super Artikel> action) {
        Iterable.super.forEach(action);
    }
}
