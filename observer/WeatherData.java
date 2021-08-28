package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. 包含最新天氣情況
 * 2. 含有觀察者集合
 * 3. 當數據有更新時，主動調用觀察者集合，通知所有接入方
 */
public class WeatherData implements Subject {
    private float temperature;
    private float perssure;
    private float humidity;
    private List<Observer> observers;
    
    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        // TODO Auto-generated method stub
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub
        if(observers.contains(o)){
            observers.remove(o);
        }
        
    }

    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub
        observers.stream().forEach(i -> {
            i.update(this.temperature, this.perssure, this.humidity);
        });
    }

    public void dataChange() {
        notifyObserver();
    }

    public void setData(float temperature, float perssure, float humidity) {
        this.temperature = temperature;
        this.perssure = perssure;
        this.humidity = humidity;
        dataChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPerssure() {
        return perssure;
    }

    public void setPerssure(float perssure) {
        this.perssure = perssure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    
    
}
