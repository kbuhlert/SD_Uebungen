package Decorator_CaesarSchluessel_Ue;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class CaesarReader extends FilterReader {

    //in diesem Bsp. müssen wir nur Funktionalität erweitern, da es die Reader bereits gibt müssen wir die nicht implementieren

    private int key;

    /**
     * Creates a new filtered reader.
     */
    public CaesarReader(Reader in) {
        super(in);
    }

    public void setKey(int key) {
        this.key = key;
    }

    //wir ersetzen nur die Read()-methode des FilterReader, da wir keine anderen brauchen

    @Override
    public int read() throws IOException {
        int c = super.read();
        if (c<0){
            return c;   //wir sind am Ende der Datei
        }
        return c-key; // eigentlich wenn das kleiner 0, dann von Maximum wegrechnen
    }

}
