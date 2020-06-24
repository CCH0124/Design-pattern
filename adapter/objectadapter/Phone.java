package adapter.objectadapter;

public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("Can use");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("So heigh");
        }
    }
}