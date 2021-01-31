package Strategy_EntenSimu_Ue;

public class Gummiente extends Ente {
    public Gummiente(String n) {
        // TODO Auto-generated constructor stub
        super(n, null);
    }

    @Override
    public void quaken() {
        System.out.println(name + " macht quietsch quietsch");
    }

    @Override
    public void schwimmen() {
        System.out.println(name + " segelt im Seifenwasser durch die Badewanne");
    }

    @Override
    public void anzeigen() {

        System.out.println(name + " ist scheu und lässt sich nicht blicken");
    }
}
