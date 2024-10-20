package design.creatation.prototype;

public class Rectangle implements Shape {

    private int width;
    private int height;

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a rectangle width %d and height %d.");
    }
    @Override
    public Shape clone() {
        return new Rectangle(width, height);
    }
}
