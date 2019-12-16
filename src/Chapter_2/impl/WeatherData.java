package Chapter_2.impl;

import Chapter_2.interfacee.Observer;
import Chapter_2.interfacee.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(temp, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    private float getTemperature() {
       return 0;
    }
    private float getHumidity() {
        return 0;
    }
    private float getPressure() {
        return 0;
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
