package design.adapter.classadapter;
import design.adapter.classadapter.adaptee.Voltage220V;
import design.adapter.classadapter.target.IVoltage5V;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV/44;
        return dstV;
    }
    
    
}