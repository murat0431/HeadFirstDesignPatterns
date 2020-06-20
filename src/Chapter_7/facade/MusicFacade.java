package Chapter_7.facade;

import Chapter_7.facade.interfaces.Closeable;
import Chapter_7.facade.interfaces.Listenable;

import java.util.Scanner;

public class MusicFacade {
    private Closeable light;
    private Listenable stereo;

    public MusicFacade(Closeable light, Listenable stereo) {
        this.light = light;
        this.stereo = stereo;
    }

    public void startMusic() {
        light.on();
        stereo.volumeUp(4);
    }

    public void endMusic() {
        stereo.volumeDown(5);
        light.off();
    }

}
