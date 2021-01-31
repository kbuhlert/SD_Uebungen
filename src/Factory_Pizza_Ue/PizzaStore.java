package Factory_Pizza_Ue;

public abstract class PizzaStore {
    //factory Methode:

    abstract Pizza createPizza(String item);

    //hier stehen noch Methoden des Pizza-Stores, bsp bestellen ausliefern...

    public Pizza orderPizza(String type) {
        //hier wird Factory methode aufgerufen/ Code ändert sich öfters
        Pizza pizza = createPizza(type);

        if (pizza != null){
            System.out.printf("Making a " + pizza.getName() + "---------");
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }
}
