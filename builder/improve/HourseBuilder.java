package builder.improve;

public abstract class HourseBuilder {
    protected Hourse hourse = new Hourse();
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    public Hourse buildHourse(){
        return hourse;
    }
}