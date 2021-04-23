package Factory_Tierzuechter_Bsp;

import com.sun.source.tree.BreakTree;

public class Dogbreeder extends AnimalBreeder{
    @Override
    Animal createAnimal(Breed breed) {
        return switch (breed) {
            case Foxhound -> new Foxhound();
            case Wolfhound -> new Wolfhound();
            default -> null;
        };
    }
}
