package Chapter_1.behavior.impl;

import Chapter_1.behavior.interfacee.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can fly with wings");
    }
}
