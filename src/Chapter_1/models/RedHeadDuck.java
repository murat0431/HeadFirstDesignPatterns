package Chapter_1.models;

import Chapter_1.behavior.impl.FlyWithWings;
import Chapter_1.behavior.impl.Quack;

/**
 * @author murat
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a RedHead");
    }
}
