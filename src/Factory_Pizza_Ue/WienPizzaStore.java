package Factory_Pizza_Ue;

public class WienPizzaStore extends PizzaStore {
    //Setzt die factory-Methode für Wiener PizzaStore um
    //

    @Override
    protected Pizza createPizza(String item) {
        if (item.equalsIgnoreCase("mushroom")){
            return new WienMushroomPizza();
        }else if (item.equalsIgnoreCase("tuna")){
            return new WienTunaPizza();
        }
        return null;
    }
}
