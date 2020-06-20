package Chapter_4.abstractfactory.pizza;

import Chapter_4.abstractfactory.ingredients.PizzaIngredientFactory;

public class VeggiePizza implements Pizza{

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        ingredientFactory.createCheese();
        ingredientFactory.createSauce();
    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
