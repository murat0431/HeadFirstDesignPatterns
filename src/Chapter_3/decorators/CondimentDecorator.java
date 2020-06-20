package Chapter_3.decorators;

import Chapter_3.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract double cost();
    public abstract String getDescription();
}
