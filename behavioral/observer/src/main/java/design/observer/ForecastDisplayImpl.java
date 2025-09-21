package design.observer;

public class ForecastDisplayImpl implements Observer, DisplayElement {
    private float currentPressure = 29.92f;  
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplayImpl(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    @Override
    public void update() {
        if ( this.weatherData instanceof WeatherDataImpl wd) {
            lastPressure = currentPressure;
            currentPressure = wd.getPressure();
        }
        
        display();
    }

    @Override
    public String display() {
        System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
            return "Improving weather on the way!";
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
            return "More of the same";
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
            return "Watch out for cooler, rainy weather";
		}
        throw new IllegalStateException("Unexpected value: " + currentPressure);
    }

    @Override
    public void setSubject(Subject sub) {
        this.weatherData = sub;
    }
    
}
