package Chapter_1.behavior.impl;

import Chapter_1.behavior.interfacee.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Can not quack!");
    }
}
