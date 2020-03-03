package principle.singleresponsibility;
/**
 * 對類別沒有大修改，只是增加方法
 * 沒有在 class 級別上遵守單一職責，但在方法級別上，扔然遵守
 */
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "road");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "Sky");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "Water");
    }
}
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.run("Car");
        vehicle.runAir("Airplan");
        vehicle.runWater("Ship");
    }
}