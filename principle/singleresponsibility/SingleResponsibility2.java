package principle.singleresponsibility;
/**
 * 遵守單一職責
 * 類越多，需同時修改客戶端
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "road way");
    }
}
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "Sky");
    }
}
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("Car");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("airplan");
    }
}