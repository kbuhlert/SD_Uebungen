package Factory_Pizza_Ue;

public class GrazPizzaStore extends PizzaStore {
    //Setzt die factory-Methode für Grazer PizzaStore um

    @Override
    protected Pizza createPizza(String item) {
        if (item.equalsIgnoreCase("mushroom")){
            return new GrazMushroomPizza();
        }else if (item.equalsIgnoreCase("veggi")){
            return new GrazVeggiPizza();
        }
        return null;
    }
}
