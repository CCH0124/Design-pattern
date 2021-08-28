package observer;

public class Client {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        Google g = new Google();

        w.registerObserver(g);
        
        w.setData(10.0f, 100.0f, 35.0f);

        Yahoo y = new Yahoo();
        w.registerObserver(y);

        w.setData(10.0f, 100.0f, 36.0f);

        w.removeObserver(g);

        w.setData(13.0f, 100.0f, 36.0f);
    }
}
