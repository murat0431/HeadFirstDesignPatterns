package Chapter_7.facade;

import Chapter_7.facade.interfaces.Closeable;
import Chapter_7.facade.interfaces.Watchable;
import Chapter_7.facade.models.Light;

public class WatchFacade {
    private Closeable light;
    private Closeable tv;
    private Watchable movie;

    public WatchFacade(Closeable light, Closeable tv, Watchable movie) {
        this.light = light;
        this.tv = tv;
        this.movie = movie;
    }

    public void startMovieNight() {
        light.off();
        tv.on();
        movie.pick();
    }

    public void endMovieNight() {
        movie.like();
        light.on();
        tv.off();
    }
}
