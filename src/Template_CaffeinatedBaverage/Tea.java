package Template_CaffeinatedBaverage;

public class Tea extends CaffeinBeverage{


    @Override
    protected void brew() {
        System.out.println("Tee mit heißen Wasser aufbrühen. 4 Min ziehen");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Extra viel Milch");
    }
}
