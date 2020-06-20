package Chapter_7.facade.models;

import Chapter_7.facade.interfaces.Closeable;

public class Light implements Closeable {
    @Override
    public void on() {
        System.out.println("Light is on!");
    }

    @Override
    public void off() {
        System.out.println("Light is off!");
    }
}
