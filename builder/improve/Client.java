package builder.improve;

public class Client {
    public static void main(String[] args) {
        CommonHourse commonHourse = new CommonHourse();
        HourseDirector hourseDirector = new HourseDirector(commonHourse);
        Hourse hourse = hourseDirector.constructHourse();

        System.out.println("---------------------------------------------------");

        HighBuilding highBuilding = new HighBuilding();
        hourseDirector.setHourseBuilder(highBuilding);
        hourseDirector.constructHourse();
    }
}