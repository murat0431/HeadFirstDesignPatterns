package Chapter_4.simplefactory;

import Chapter_4.models.pizza.Pizza;
import Chapter_4.models.pizza.VeggiePizza;

public class PizzaShop {
    private Factory factory;

    public PizzaShop(Factory factory) {
        this.factory = factory;
    }
    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
