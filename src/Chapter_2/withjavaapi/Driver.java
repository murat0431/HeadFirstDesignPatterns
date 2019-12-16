package Chapter_2.withjavaapi;

import java.util.Observable;
import java.util.Observer;

public class Driver {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Observer o = new Display(wd);
        wd.setMeasurements(12.3f, 32.4f, 18.9f);

    }
}
