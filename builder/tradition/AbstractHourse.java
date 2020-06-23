package builder.tradition;

public abstract class AbstractHourse {
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}