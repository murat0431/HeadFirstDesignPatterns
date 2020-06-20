package Chapter_7.facade.models;

import Chapter_7.facade.interfaces.Watchable;

public class Movie implements Watchable {
    @Override
    public void pick() {
        System.out.println((int)(Math.random()*40+1980) + " is the year of the movie!");
    }

    @Override
    public void like() {
        System.out.println("You liked this movie!");
    }
}
