package Command_SmarteFernbedienung1_Ue;

public class App {
    public static void main(String[] args) {


    //das entspricht unserem Client im pattern
    //wir erzeugen fernbedienung und die Fernbedienung ist der Aufrufer (invoker)
    EinfacheSmarteFernbedienung fbg = new EinfacheSmarteFernbedienung();

    //Empfänger (Receiver) im Patter und empfängt Kommando
    Licht licht = new Licht();
    LichtAnKommando lk = new LichtAnKommando(licht);

    //jetzt wird fernbedienung "programmiert" und bekommt Kommando zugewieden
    fbg.setKommando(lk);

    fbg.knopfgedrueckt();
    }

}
