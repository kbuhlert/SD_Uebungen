package Template_CaffeinatedBaverage;

public class Coffee extends CaffeinBeverage{
    @Override
    protected void brew() {
        System.out.println("Lange ziehen lassen, vorsichtig aufgießen");
    }

    @Override
    protected void addCondiments() {
        System.out.println("mit Milch und Zucker");
    }
}
