package bridge;

public class Vivo implements Brand {
    @Override
    public void open() {
        // TODO Auto-generated method stub
        System.out.println("Vivo開機");
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        System.out.println("Vivo關機");
    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        System.out.println("Vivo打電話");
    }
}