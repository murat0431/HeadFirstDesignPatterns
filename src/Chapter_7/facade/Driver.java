package Chapter_7.facade;

import Chapter_7.facade.interfaces.Closeable;
import Chapter_7.facade.models.Light;
import Chapter_7.facade.models.Movie;
import Chapter_7.facade.models.MusicBox;
import Chapter_7.facade.models.TV;

public class Driver {
    public static void main(String[] args) {
        Closeable light = new Light();
        WatchFacade wf = new WatchFacade(light, new TV(), new Movie());
        wf.startMovieNight();
        wf.endMovieNight();
        MusicFacade mf = new MusicFacade(light, new MusicBox());
        mf.startMusic();
        mf.endMusic();
    }
}
