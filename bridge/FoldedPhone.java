package bridge;

public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("摺疊樣式手機");
    }

    public void close(){
        super.close();
        System.out.println("摺疊樣式手機");
    }

    public void call(){
        super.call();
        System.out.println("摺疊樣式手機");
    }
}