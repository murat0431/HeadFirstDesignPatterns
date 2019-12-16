package Chapter_2.driver;

import Chapter_2.impl.WeatherData;
import Chapter_2.impl.display.CurrentConditionsDisplay;
import Chapter_2.interfacee.Display;

import java.util.Observable;

public class Driver {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Display current = new CurrentConditionsDisplay(wd);
        wd.setMeasurements(62.1f, 23.4f, 45.2f);
        wd.setMeasurements(61.9f, 23.6f, 45);



    }
}
