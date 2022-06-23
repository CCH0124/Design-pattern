package observer.pull.impl;

import observer.pull.DisplayElement;
import observer.pull.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        String format = String.format("Avg/Max/Min temperature = %f / %f / %f", (tempSum / numReadings), maxTemp, minTemp);
        System.out.println(format);
    }

    @Override
    public void update() {
        var temperature = weatherData.getTemperature();
        tempSum += temperature;
        numReadings++;
        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }
        display();
    }
}
