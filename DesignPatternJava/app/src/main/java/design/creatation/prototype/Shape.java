package design.creatation.prototype;

public interface Shape extends Cloneable {
    void draw();
    Shape clone();
}
