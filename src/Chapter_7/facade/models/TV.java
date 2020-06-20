package Chapter_7.facade.models;

import Chapter_7.facade.interfaces.Closeable;
import Chapter_7.facade.interfaces.Listenable;

public class TV extends AbstractListenable implements Closeable {

    public TV() {
        super();
    }
    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }

}
