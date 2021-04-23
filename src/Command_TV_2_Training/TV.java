package Command_TV_2_Training;

public class TV {
    // TV = Receiver und enthält Methoden die dann ausgeführt werden von den Commands
    private int channel = 1;
    private boolean on = false;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void einschalten() {
        on = true;
        System.out.println("TV eingeschaltet");
    }

    public void ausschalten() {
        on = false;
        System.out.println("TV ausgeschaltet");
    }

    public void channelUp() {
        if(channel<40){
            channel++;
        }else channel = 1;
        System.out.println("Channel Up. Aktueller Kanal: " + channel);
    }

    public void channelDown() {
        if(channel > 1){
            channel--;
        }else channel = 40;
        System.out.println("Channel Down. Aktueller Kanal: " + channel);
    }

    public void tvSettings() {
        System.out.println("TV an ist: " + on + "/ TV-Kanal: " + channel);
    }

}
