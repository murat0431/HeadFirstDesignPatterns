package Chapter_3.components;

import Chapter_3.Beverage;

public class DarkRoast extends Beverage {
     String description = "sdada";
    public DarkRoast() {
        super.description = "Dark Roast";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
