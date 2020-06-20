package Chapter_3.decorators;

import Chapter_3.Beverage;

public class Whip extends CondimentDecorator{
    private Beverage component;
    public Whip(Beverage component) {
        this.component = component;
    }
    @Override
    public double cost() {
        return 0.1 + component.cost();
    }

    @Override
    public String getDescription() {
        return "Whip " + component.getDescription();
    }
}
