package Chapter_4.abstractfactory.ingredients;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public void createSauce() {
        System.out.println("NY Sauce is created");
    }

    @Override
    public void createCheese() {
        System.out.println("NY Cheese is created");
    }
}
