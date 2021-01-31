package Template_CaffeinatedBaverage;

public abstract class CaffeinBeverage {
    // template Methode -> soll nicht überschrieben werden können ist deshalb final

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourCup();
        addCondiments();
    }

    protected void boilWater(){
        System.out.println("Wasser kochen");
    }

    protected abstract void brew();

    protected void pourCup(){
        System.out.println("In Tasse gießen");
    }

    protected abstract void addCondiments();
}
