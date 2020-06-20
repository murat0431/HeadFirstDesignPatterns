package Chapter_4.models.pizza;

public class PepperoniPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("PepperoniPizza is being prepared");
    }

    @Override
    public void bake() {
        System.out.println("PepperoniPizza is being baked");
    }

    @Override
    public void cut() {
        System.out.println("PepperoniPizza is being cutted");
    }

    @Override
    public void box() {
        System.out.println("PepperoniPizza is being boxed");
    }
}
