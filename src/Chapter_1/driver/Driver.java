package Chapter_1.driver;

import Chapter_1.behavior.impl.FlyNoWay;
import Chapter_1.behavior.impl.FlyWithWings;
import Chapter_1.behavior.interfacee.FlyBehavior;
import Chapter_1.models.Duck;
import Chapter_1.models.MallardDuck;
import Chapter_1.models.RedHeadDuck;

public class Driver {
    public static void main(String[] args) {
        Duck d = new MallardDuck();
        d.performFly();
        d.setFlyBehavior(new FlyNoWay());
        d.performFly();

    }
}
