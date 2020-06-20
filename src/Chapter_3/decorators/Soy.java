package Chapter_3.decorators;

import Chapter_3.Beverage;

public class Soy extends CondimentDecorator{
    private Beverage component;
    public Soy(Beverage component) {
        this.component = component;
    }
    @Override
    public double cost() {
        return 0.15 + component.cost();
    }

    @Override
    public String getDescription() {
        return "Soy " + component.getDescription();
    }
}
