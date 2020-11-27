package Ue_Ddecorator_CaesarSchluessel;

import java.io.*;

public class main {
    public static void main(String[] args) {

        try {
            Reader r = new CaesarReader(new FileReader(new File("geheim2.txt")));
            ((CaesarReader)r).setKey(14);

            int c;
            while ((c = r.read()) >= 0){
                System.out.println(Character.toChars(c)[0]);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
