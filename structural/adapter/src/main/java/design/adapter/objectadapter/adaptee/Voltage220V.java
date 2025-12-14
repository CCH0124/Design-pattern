package design.adapter.objectadapter.adaptee;

public class Voltage220V {
    public int output220V() {
        int src = 220;
        System.out.println("%d Voltage".formatted(src));
        return src;
    }
}
