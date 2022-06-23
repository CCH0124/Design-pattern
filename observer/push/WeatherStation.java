package observer.push;

import observer.push.impl.CurrentConditionsDisplay;
import observer.push.impl.StatisticsDisplay;
import observer.push.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(90, 60, 30.1f);
        weatherData.setMeasurements(70, 52, 30.2f);
    }
}
