package Command_TV_2_Training;

public class CommandChanelDown implements Command{

    private TV tv;

    public CommandChanelDown(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        if(!tv.isOn()){
            tv.setOn(true);
        }
        tv.channelDown();
    }

    @Override
    public void undo() {
        tv.channelUp();
    }
}
