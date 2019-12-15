package Chapter_1.models;

import Chapter_1.behavior.interfacee.FlyBehavior;
import Chapter_1.behavior.interfacee.QuackBehavior;

/**
 * @author murat
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public void swim() {
        System.out.println("Swim swim");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void perFormQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
