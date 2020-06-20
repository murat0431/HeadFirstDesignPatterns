package Chapter_7.facade.models;

public class MusicBox extends AbstractListenable {
    private static final int DEFAULT_VOLUME = 2;
    public MusicBox() {
        this.volume = DEFAULT_VOLUME;
    }
}
