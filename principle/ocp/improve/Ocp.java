package principle.ocp.improve;
abstract class Shape {
    int m_type;
    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle(){
        super.m_type = 1;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("drawRectangle");
    }
}
class Circle extends Shape {
    Circle(){
        super.m_type = 2;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("drawCircle");
    }
}
class Triangle extends Shape {
    Triangle(){
        super.m_type = 3;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("drawTriangle");
    }
}

class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }
}
public class Ocp{
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}