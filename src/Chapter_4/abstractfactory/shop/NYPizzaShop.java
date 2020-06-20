package Chapter_4.abstractfactory.shop;

import Chapter_4.abstractfactory.ingredients.NYPizzaIngredientFactory;
import Chapter_4.abstractfactory.ingredients.PizzaIngredientFactory;
import Chapter_4.abstractfactory.pizza.ClamPizza;
import Chapter_4.abstractfactory.pizza.Pizza;
import Chapter_4.abstractfactory.pizza.VeggiePizza;
import Chapter_4.factorymethod.models.pizza.NyVeggiePizza;

public class NYPizzaShop extends PizzaShop {

    @Override
    public Pizza create(String type) {
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();
        if (type.equals("veggie")) {
            return new VeggiePizza(ingredientFactory);
        } else if (type.equals("clam")) {
            return new ClamPizza(ingredientFactory);
        }
        return null;
    }
}
