package observer.push;

/**
 * 要成為觀察者的物件需實作此介面
 */
public interface Observer {
    /**
     * 當 Subject 狀態改變時，他就會被呼叫
     * @param temperature
     * @param humidity
     * @param pressure
     */
    void update(float temperature, float humidity, float pressure);
}
