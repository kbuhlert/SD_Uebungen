package Decorator_Slotmachine_Bsp;

public abstract class AbstractSlotMachineDecorator implements ISlotMachine{

    private ISlotMachine slotmachine;

    public AbstractSlotMachineDecorator(ISlotMachine slotmachine) {
        super();
        this.slotmachine = slotmachine;
    }

    @Override
    public boolean play() {
        return slotmachine.play();
    }

    @Override
    public int[] getLastResult() {
        return slotmachine.getLastResult();
    }
}
