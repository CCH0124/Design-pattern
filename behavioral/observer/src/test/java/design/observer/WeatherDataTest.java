package design.observer;

import org.junit.jupiter.api.Test;

public class WeatherDataTest {
    @Test
    public void testWeatherData() {
        WeatherDataImpl weatherData = new WeatherDataImpl();

        CurrentConditionsDisplayImpl currentDisplay = new CurrentConditionsDisplayImpl(weatherData);
        StatisticsDisplayImpl statisticsDisplay = new StatisticsDisplayImpl(weatherData);
        ForecastDisplayImpl forecastDisplay = new ForecastDisplayImpl(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        weatherData.unregister(forecastDisplay);
		weatherData.setMeasurements(62, 90, 28.1f);
    }

    @Test
    public void WeatherStationHeatIndexTest() {
        WeatherDataImpl weatherData = new WeatherDataImpl();
        CurrentConditionsDisplayImpl currentDisplay = new CurrentConditionsDisplayImpl(weatherData);
        StatisticsDisplayImpl statisticsDisplay = new StatisticsDisplayImpl(weatherData);
        ForecastDisplayImpl forecastDisplay = new ForecastDisplayImpl(weatherData);
        HeatIndexDisplayImpl heatIndexDisplay = new HeatIndexDisplayImpl(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
    }
}
