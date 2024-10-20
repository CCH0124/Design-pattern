package design.creatation.prototype;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class ShapeTest {
    @Test
    public void cloneTest() {
        Circle circle = new Circle("Red");
        Rectangle rectangle = new Rectangle(10, 5);

        var circlieClone = circle.clone();
        var rectangleClone = rectangle.clone();
        System.out.println("rectangle clone hash code: " + rectangleClone.hashCode());
        System.out.println("rectangle hash code: " + rectangle.hashCode());
        assertNotEquals(circlieClone, circle);
        assertNotEquals(rectangleClone, rectangle);
    }
}
