package Chapter_2.impl.display;

import Chapter_2.interfacee.Display;
import Chapter_2.interfacee.Observer;
import Chapter_2.interfacee.Subject;

public class CurrentConditionsDisplay implements Display, Observer {
    private float currentTemp;
    private float currentHumidity;
    private float currentPressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject subject) {
        weatherData = subject;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Temperature is: " + currentTemp);
        System.out.println("Current Humidity is: " + currentHumidity);
        System.out.println("Current Pressure is: " + currentPressure);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        currentTemp = temp;
        currentHumidity = humidity;
        currentPressure = pressure;
        display();
    }
}
