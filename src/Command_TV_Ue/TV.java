package Command_TV_Ue;

public class TV {

    private Kanal channel = null;
    private boolean statusOn = false;


    public Kanal getChannel() {
        return channel;
    }

    public void setChannel(Kanal channel) {
        this.channel = channel;
    }

    public void TVan (){
        System.out.println("TV ist an");
    }

    public void TVoff (){
        System.out.println("TV ist aus");
    }

    public boolean getStatusOn() {
        return statusOn;
    }

    public void setStatusOn(boolean setOnOff) {
        this.statusOn = setOnOff;
    }
}
