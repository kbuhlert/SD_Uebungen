package Factory_Tierzuechter_Bsp;

public class App {

    public static void main(String[] args) {
        Dogbreeder doggy = new Dogbreeder();

        Animal wolfhound = doggy.deliverAnimal(Breed.Wolfhound);

        System.out.println(wolfhound.name);
    }

}
