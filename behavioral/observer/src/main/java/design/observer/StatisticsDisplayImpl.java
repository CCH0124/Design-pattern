package design.observer;

public class StatisticsDisplayImpl implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplayImpl(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    @Override
    public void update() {
        if ( this.weatherData instanceof WeatherDataImpl wd) {
            float temp = wd.getTemperature();
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }
        }
        display();
    }

    @Override
    public String display() {
        String stats = "Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp;
        System.out.println(stats);
        return stats;
    }

    @Override
    public void setSubject(Subject sub) {
        this.weatherData = sub;
    }
    
}
