package Strategy_EntenSimu_Ue;


public abstract class Ente {

    protected String name;
    Flugverhalten flugverhalten;

    public Ente(String n, Flugverhalten f) {
        name = n;
        flugverhalten = f;
    }

    public void quaken()
    {
        System.out.println("Ente " + name + " quakt");
    }
    public void schwimmen()
    {
        System.out.println("Ente schwimmt");
    }
    public void fliegen()
    {
        if (flugverhalten != null)
        {
            flugverhalten.fliegen();
        }
    }
    public abstract void anzeigen();
}
