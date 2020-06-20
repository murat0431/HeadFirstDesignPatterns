package Chapter_4.simplefactory;

import Chapter_4.models.pizza.Pizza;

public interface Factory {
    Pizza createPizza(String type);
}
