package Command_TV_Ue;

public class ChannelUPCommand implements Command{

    private Kanal channel;

    public ChannelUPCommand(Kanal channel) {
        this.channel = channel;
    }

    /*
    // ruft die Methode des Empfängers (das angesteuerte Licht) auf
    @Override
    public void ausfuehren() {
        licht.an();
    }*/

    @Override
    public void kommandoAusfuehren() {
        channel.channelUp(channel.getChannel());
    }
}
