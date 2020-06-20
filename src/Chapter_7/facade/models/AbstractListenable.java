package Chapter_7.facade.models;

import Chapter_7.facade.interfaces.Listenable;

public abstract class AbstractListenable implements Listenable {
    int volume;
    static final int DEFAULT_VOLUME = 5;

    AbstractListenable() {
        volume = DEFAULT_VOLUME;
    }
    @Override
    public void volumeUp(int volume) {
        this.volume +=volume;
        System.out.println("New volume is: " + this.volume);
    }

    @Override
    public void volumeDown(int volume) {
        this.volume -= volume;
        System.out.println("New volume is " + this.volume);
    }
}
