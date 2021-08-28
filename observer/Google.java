package observer;

public class Google implements Observer {
    private float temperature;
    private float perssure;
    private float humidity;

    @Override
    public void update(float temperature, float perssure, float humidity) {
        this.temperature = temperature;
        this.perssure = perssure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Temperature: "+ temperature);
        System.out.println("Perssure: "+ perssure);
        System.out.println("Humidity: "+ humidity);
    }
}
