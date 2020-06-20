package Chapter_4.models.pizza;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("CheesePizza is being prepared");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza is being baked");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza is being cutted");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza is being boxed");
    }
}
