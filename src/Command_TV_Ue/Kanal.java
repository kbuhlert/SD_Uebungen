package Command_TV_Ue;

public class Kanal {

    private int channel = 0;

    private Command kommando;

    public void setKommando(Command k){
        kommando = k;
    }

    public void kanalhoch(){
        kommando.kommandoAusfuehren();
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void channelUp (int channel){
        channel++;
        System.out.println("Kanal erhöht. Aktueller Kanal = " + channel);
    }

    public void channelDown (int channel){
        channel--;
        System.out.println("Kanal runter geschaltet. Aktueller Kanal = " + channel);
    }
}
