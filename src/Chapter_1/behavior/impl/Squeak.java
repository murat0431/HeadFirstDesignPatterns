package Chapter_1.behavior.impl;

import Chapter_1.behavior.interfacee.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak squeak!");
    }
}
