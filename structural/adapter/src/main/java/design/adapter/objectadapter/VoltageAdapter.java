package design.adapter.objectadapter;

import java.util.Objects;

import design.adapter.objectadapter.adaptee.Voltage220V;
import design.adapter.objectadapter.target.IVoltage5V;

public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (Objects.nonNull(voltage220V)) {
            int src = voltage220V.output220V();
            System.out.println("Adapter ...");
            dst = src / 44;
            System.out.println("Adapter finish!!"+ dst);
        }
        return dst;
    }
}
