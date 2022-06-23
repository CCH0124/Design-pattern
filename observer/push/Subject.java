package observer.push;

/**
 * 物件使用此介面將自己註冊為觀察者或是將自己變成非觀察者
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    // 當 Subject 狀態改變時，這個方法會被呼叫，藉以通知所有觀察者
    public void notifyObservers();
}
