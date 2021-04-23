package Command_TV_2_Training;

public class CommandChanelUp implements Command{

    private TV tv;

    public CommandChanelUp(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        if(!tv.isOn()){
            tv.setOn(true);
        }
        tv.channelUp();
    }

    @Override
    public void undo() {
        tv.channelDown();
    }
}
