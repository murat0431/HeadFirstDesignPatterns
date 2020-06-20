package Chapter_4.simplefactory;

import Chapter_4.models.pizza.*;

public class SimplePizzaFactory implements Factory{

    @Override
    public Pizza createPizza(String type) {
        switch (type.toLowerCase()) {
            case "cheese":
                return new CheesePizza();
            case "clam":
                return new ClamPizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "veggie":
                return new VeggiePizza();
            default:
                return null;
        }
    }
}
