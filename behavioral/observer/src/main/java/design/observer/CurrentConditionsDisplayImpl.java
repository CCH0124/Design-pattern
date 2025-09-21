package design.observer;

public class CurrentConditionsDisplayImpl implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplayImpl(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    @Override
    public void update() {
        if ( this.weatherData instanceof WeatherDataImpl wd) {
            temperature = wd.getTemperature();
            humidity = wd.getHumidity();
        }
        display();
    }

    @Override
    public String display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
        return "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity";
    }

    @Override
    public void setSubject(Subject sub) {
        this.weatherData = sub;
    }
    
}
