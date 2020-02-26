package principle.singleresponsibility;
/**
 * run Method 違反單一職責
 * 根據交通不同的運行，分解成不同類
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "Run");
    }
}
public class SingleResopnsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("Car");
        vehicle.run("airplan");
    }
}