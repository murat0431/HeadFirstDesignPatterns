package Chapter_4.abstractfactory.ingredients;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public void createSauce() {
        System.out.println("Chicago sauce is created");
    }

    @Override
    public void createCheese() {
        System.out.println("Chicago Cheese is created");
    }
}
