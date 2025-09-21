package design.observer;

import java.util.ArrayList;
import java.util.List;


public class WeatherDataImpl implements Subject {
    private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

    public WeatherDataImpl() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer obj) {
		observers.add(obj);
	}

	@Override
	public void unregister(Observer obj) {
		observers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		observers.stream().parallel().forEach(observer -> observer.update());
	}

	@Override
	public Object getUpdate(Observer obj) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getUpdate'");
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

}
