package Decorator_String;

public class Main {
    public static void main(String[] args) {
        SpecialString einString = new SpecialString("Hier steht ein Satz in dem ein A drin vorkommt");
        System.out.println("Der String enthält den Buchstaben a/A so oft: " + einString.countA());
    }
}
