package Chapter_3.decorators;

import Chapter_3.Beverage;

public class Mocha extends CondimentDecorator{
    private Beverage component;
    public Mocha(Beverage component) {
        this.component = component;
    }
    @Override
    public double cost() {
        return 0.2 + component.cost();
    }

    @Override
    public String getDescription() {
        return "Mocha " + component.getDescription();
    }
}
