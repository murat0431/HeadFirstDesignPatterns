package Chapter_4.models.pizza;

public class VeggiePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("VeggiePizza is being prepared");
    }

    @Override
    public void bake() {
        System.out.println("VeggiePizza is being baked");
    }

    @Override
    public void cut() {
        System.out.println("VeggiePizza is being cutted");
    }

    @Override
    public void box() {
        System.out.println("VeggiePizza is being boxed");
    }
}
