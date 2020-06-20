package Chapter_4.factorymethod.models.store;

import Chapter_4.factorymethod.models.pizza.NyVeggiePizza;
import Chapter_4.factorymethod.models.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        switch (type.toLowerCase()) {
            case "veggie" :
                return new NyVeggiePizza();
            default:
                return null;
        }
    }
}
