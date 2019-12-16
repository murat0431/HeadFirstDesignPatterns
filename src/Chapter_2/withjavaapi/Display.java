package Chapter_2.withjavaapi;

import org.w3c.dom.ls.LSOutput;

import java.util.Observable;
import java.util.Observer;

public class Display implements Observer {
    private Observable o;
    private float temp;
    private float humidity;
    private float pressure;

    public Display(Observable o) {
        this.o = o;
        o.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        WeatherData wd = (WeatherData) o;
        this.temp = wd.getTemperature();
        this.humidity = wd.getHumidity();
        this.pressure = wd.getPressure();
        display();
    }

    public void display() {
        System.out.println("The current temperature is: " + temp);
        System.out.println("The current humidity is: " + humidity);
        System.out.println("The current pressure is: " + pressure);
    }

}
