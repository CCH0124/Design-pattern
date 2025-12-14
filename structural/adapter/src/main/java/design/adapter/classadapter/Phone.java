package design.adapter.classadapter;
import design.adapter.classadapter.target.IVoltage5V;

public class Phone {
    public String charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("Can use");
            return "Can use";
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("So heigh");
            return "So heigh";
        }
        return "Error";
    }
}