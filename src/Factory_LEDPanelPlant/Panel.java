package Factory_LEDPanelPlant;

public abstract class Panel {
    protected long serial;
    protected int size;
    public Panel(int size) {
        serial = (long)(Math.random() * 1000000);
        this.size = size;
    }

    public abstract String getIdentifier();

    @Override
    public String toString() {
        return getIdentifier();
    }
}
