package Chapter_4.simplefactory;

public class Driver {
    public static void main(String[] args) {
        new PizzaShop(new SimplePizzaFactory()).orderPizza("pepperoni");
    }
}
