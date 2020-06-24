package adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V; // 聚合

    @Override
    public int output5V() {
        // TODO Auto-generated method stub
        int dst = 0;
        if (voltage220V != null) {
            int src = voltage220V.output220V();
            System.out.println("Adapter ...");
            dst = src / 44;
            System.out.println("Adapter finish!!"+ dst);
        }

        return dst;
    }

    /**
     * @param voltage220v
     */
    public VoltageAdapter(Voltage220V voltage220v) {
        voltage220V = voltage220v;
    }

}