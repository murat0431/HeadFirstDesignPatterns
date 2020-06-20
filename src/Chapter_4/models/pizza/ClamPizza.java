package Chapter_4.models.pizza;

public class ClamPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("ClamPizza is being prepared");
    }

    @Override
    public void bake() {
        System.out.println("ClamPizza is being baked");
    }

    @Override
    public void cut() {
        System.out.println("ClamPizza is being cutted");
    }

    @Override
    public void box() {
        System.out.println("ClamPizza is being boxed");
    }
}
