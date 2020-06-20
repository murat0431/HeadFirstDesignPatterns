package Chapter_4.factorymethod.driver;

import Chapter_4.factorymethod.models.pizza.Pizza;
import Chapter_4.factorymethod.models.store.NYPizzaStore;
import Chapter_4.factorymethod.models.store.PizzaStore;

public class Driver {
    public static void main(String[] args) {
        PizzaStore ps = new NYPizzaStore();
        Pizza p = ps.orderPizza("veggie");
        System.out.println(p);
    }
}
