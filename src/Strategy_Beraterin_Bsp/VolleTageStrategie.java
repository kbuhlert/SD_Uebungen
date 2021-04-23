package Strategy_Beraterin_Bsp;

public class VolleTageStrategie implements IStrategie{
    @Override
    public double calc(Rechnung r) {

        if(r.getStunden()%8.0 == 0){
            return r.getStunden()/8.0 * r.getBerater().getTagessatz();
        }
        else {
            return (((r.getStunden() - r.getStunden()%8.0)/8.0) + 1.0) * r.getBerater().getTagessatz();
        }

        //alternative Rechnung mit Aufrunden von Chris:
        //return Math.ceil(rechnung.getStunden() / 8.0) * rechnung.getBerater().getTagsatz();
    }
}
