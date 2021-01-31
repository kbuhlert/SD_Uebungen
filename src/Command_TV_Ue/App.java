package Command_TV_Ue;

public class App {
    public static void main(String[] args) {
        /*ACHTUNG IST NOCH NICHT KPORREKT. CODE VON CHRIS NOCHMAL ANSCHAUEN!!!!!*/
        TV tv = new TV();

        Kanal Tvkanal = new Kanal();

        ChannelUPCommand chanelUp = new ChannelUPCommand(Tvkanal);

        Tvkanal.setChannel(5);
        Tvkanal.setKommando(chanelUp);
        Tvkanal.kanalhoch();
        Tvkanal.kanalhoch();
        Tvkanal.kanalhoch();
    }
}
