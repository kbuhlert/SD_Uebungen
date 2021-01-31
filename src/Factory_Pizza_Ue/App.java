package Factory_Pizza_Ue;

public class App {

    public static void main(String[] args) {
        PizzaStore grazStore = new GrazPizzaStore();
        PizzaStore wienStore = new WienPizzaStore();

        Pizza veggiepizza = grazStore.orderPizza("veggi");
        System.out.println(veggiepizza);
        Pizza tunaPizza = wienStore.orderPizza("tuna");
        System.out.println(tunaPizza);

    }

}

