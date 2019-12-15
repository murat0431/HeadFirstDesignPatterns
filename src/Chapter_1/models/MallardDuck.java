package Chapter_1.models;

import Chapter_1.behavior.impl.FlyWithWings;
import Chapter_1.behavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard!");
    }
}
