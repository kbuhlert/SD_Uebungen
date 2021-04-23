package Strategy_Beraterin_Bsp;

public class Stundenstrategie implements IStrategie{
    @Override
    public double calc(Rechnung r) {
        return r.getStunden() * r.getBerater().getStundensatz();
    }
}
