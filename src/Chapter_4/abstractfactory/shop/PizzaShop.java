package Chapter_4.abstractfactory.shop;

import Chapter_4.abstractfactory.pizza.Pizza;

public abstract class PizzaShop {
    public void order(String type) {
        Pizza pizza = create(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
    public abstract Pizza create(String type);
}
