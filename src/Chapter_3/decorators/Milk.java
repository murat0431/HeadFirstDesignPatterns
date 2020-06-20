package Chapter_3.decorators;

import Chapter_3.Beverage;

public class Milk extends CondimentDecorator{
    private Beverage component;
    public Milk(Beverage component) {
        this.component = component;
    }
    @Override
    public double cost() {
        return 0.1 + component.cost();
    }

    @Override
    public String getDescription() {
        return "Milk " + component.getDescription();
    }
}
