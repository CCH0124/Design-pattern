package builder.improve;

public class CommonHourse extends HourseBuilder {

    @Override
    public void buildBasic() {
        // TODO Auto-generated method stub
        System.out.println("普通房子地基 5 m");
    }

    @Override
    public void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println("普通房子砌牆");
    }

    @Override
    public void roofed() {
        // TODO Auto-generated method stub
        System.out.println("普通房子封頂");
    }
    
}